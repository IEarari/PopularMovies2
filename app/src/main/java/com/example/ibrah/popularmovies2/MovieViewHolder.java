package com.example.ibrah.popularmovies2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    public ImageView mIvMovie;
    private LinearLayout mProgressBarContainer;

    public MovieViewHolder(View itemView) {
        super(itemView);

        mProgressBarContainer = itemView.findViewById(R.id.progressBarContainer);
        mIvMovie = itemView.findViewById(R.id.cvVideo);
    }

    public void showProgress(Boolean show) {
        mProgressBarContainer.setVisibility(show ? View.VISIBLE : View.GONE);
    }
}
