package com.example.ad_340dipendraweek1assignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {
    ProfileData profileDate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView name = view.findViewById(R.id.name);
        TextView occupation = view.findViewById(R.id.occupationField);
        TextView age = view.findViewById(R.id.age);
        TextView description = view.findViewById(R.id.descriptionField);

        return view;
    }

    public void setProfileDate (ProfileData profileData) {
        this.profileDate = profileData;
    }
}