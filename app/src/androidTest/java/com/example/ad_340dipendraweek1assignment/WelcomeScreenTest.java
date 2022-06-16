package com.example.ad_340dipendraweek1assignment;

//@RunWith(AndroidJUnit4.class)
//public class WelcomeScreenTest {
//    @Rule
//    public ActivityScenarioRule<WelcomeScreen> welcomeScreenActivity =
//            new ActivityScenarioRule<>(WelcomeScreen.class);
//
//    @Before
//    public void setUp() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            getInstrumentation().getUiAutomation().executeShellCommand(
//                    "appops set " + ApplicationProvider.getApplicationContext().getPackageName() + " android:mock_location allow");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Test
//    public void clickingOnMatchesDrawerItemDisplaysMatchesFragment() {
//        onView(withContentDescription("Open navigation drawer")).perform(click());
//        onView(withId(R.id.matches_menu_item)).perform(click());
//
//        double latitude = 47.6082d;
//        double longitude = -122.1890d;
//        welcomeScreenActivity.getScenario().onActivity(activity -> {
//            LocationUtils.startUpdates(activity,
//                    new Handler(Looper.getMainLooper()),
//                    latitude, longitude);
//        });
//
//        onView(isRoot()).perform(HelpersViewMatcher.waitView(withText("Cool Guy Mike"), 5000));
//
//        onView(withRecyclerView(R.id.recycler_view).atPosition(0))
//                .check(matches(hasDescendant(withText("Cool Guy Mike"))));
//    }
//
//    @Test
//    public void clickingOnSettingsDrawerItemDisplaysSettingsFragment() {
//        onView(withContentDescription("Open navigation drawer")).perform(click());
//        onView(withId(R.id.settings_menu_item)).perform(click());
//
//        onView(withId(R.id.matches_reminder_time_label)).check(
//                matches(withText("Pick your daily matches reminder time")));
//    }
//}

