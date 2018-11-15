package com.example.ibrah.popularmovies2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class VideoViewHolder extends RecyclerView.ViewHolder {
    public ImageView mIvVideoThumb;
    public TextView mTvVideoTitle;

    public VideoViewHolder(View itemView) {
        super(itemView);

        mIvVideoThumb = itemView.findViewById(R.id.cvVideo);
        mTvVideoTitle = itemView.findViewById(R.id.tvVideoTitle);
    }
}
