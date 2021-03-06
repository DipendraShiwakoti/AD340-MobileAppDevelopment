package com.example.ad_340dipendraweek1assignment;


import static androidx.test.espresso.matcher.ViewMatchers.isRoot;

import android.view.View;

import androidx.test.espresso.PerformException;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.util.HumanReadables;
import androidx.test.espresso.util.TreeIterables;

import com.google.android.material.slider.RangeSlider;

import org.hamcrest.Matcher;

import java.util.concurrent.TimeoutException;

public class HelpersViewMatcher {
    /**
     * Perform action of waiting for a specific view id.
     * @param viewMatcherParam The id of the view to wait for.
     * @param millis The timeout of until when to wait for.
     */
    public static ViewAction waitView(Matcher<View> viewMatcherParam, final long millis) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isRoot();
            }

            @Override
            public String getDescription() {
                return "wait for a specific view with id <" + viewMatcherParam + "> during " + millis + " millis.";
            }

            @Override
            public void perform(final UiController uiController, final View view) {
                uiController.loopMainThreadUntilIdle();
                final long startTime = System.currentTimeMillis();
                final long endTime = startTime + millis;

                do {
                    for (View child : TreeIterables.breadthFirstViewTraversal(view)) {
                        // found view with required ID
                        if (viewMatcherParam.matches(child)) {
                            return;
                        }
                    }

                    uiController.loopMainThreadForAtLeast(50);
                }
                while (System.currentTimeMillis() < endTime);

                // timeout happens
                throw new PerformException.Builder()
                        .withActionDescription(this.getDescription())
                        .withViewDescription(HumanReadables.describe(view))
                        .withCause(new TimeoutException())
                        .build();
            }
        };
    }

    public static ViewAction setValue(Float value1, Float value2) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return ViewMatchers.isAssignableFrom(RangeSlider.class);
            }

            @Override
            public String getDescription() {
                return "Set Slider value to $value";
            }

            @Override
            public void perform(final UiController uiController, final View view) {
                RangeSlider seekBar = (RangeSlider) view;
                seekBar.setValues(value1, value2);
            }
        };
    }
}