package com.example.ad_340dipendraweek1assignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MatchesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_matches, container, false);

         List<Matches> matchesList = new ArrayList<>();
        // matchesList.add(new Matches("Mark t", "really cool guy", false));
        // matchesList.add(new Matches("Nicol T", "really cool guy", true));
       // matchesList.add(new Matches("Tone R", "really cool guy", false));

        // Set up the RecyclerView

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
        MatchesRecyclerViewAdapter adapter = new MatchesRecyclerViewAdapter(matchesList);
        recyclerView.setAdapter(adapter);


        return view;
    }
}