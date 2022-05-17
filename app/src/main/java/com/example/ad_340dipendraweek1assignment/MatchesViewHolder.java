package com.example.ad_340dipendraweek1assignment;



import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class MatchesViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView matchesImage;
    public TextView matchesName;
    public TextView matchesDescription;

    public MatchesViewHolder(@NonNull View itemView) {
        super(itemView);
        matchesImage = itemView.findViewById(R.id.matches_image);
        matchesName = itemView.findViewById(R.id.matches_name);
        matchesDescription = itemView.findViewById(R.id.matches_description);
    }
}
