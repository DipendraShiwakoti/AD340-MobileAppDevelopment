package com.example.ad_340dipendraweek1assignment;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Adapter used to show a simple grid of products.
 */
public class MatchesRecyclerViewAdapter extends RecyclerView.Adapter<MatchesViewHolder> {

    private List<Matches> matchesList;


    MatchesRecyclerViewAdapter(List<Matches> productList) {
        this.matchesList = matchesList;
    }

    @NonNull
    @Override
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.matches_card, parent, false);
        return new MatchesViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolder holder, int position) {
        // TODO: Put ViewHolder binding code here in MDC-102
    }

    @Override
    public int getItemCount() {
        return matchesList.size();
    }
}
