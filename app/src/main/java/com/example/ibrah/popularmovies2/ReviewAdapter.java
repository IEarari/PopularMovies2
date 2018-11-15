package com.example.ibrah.popularmovies2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ReviewAdapter extends RecyclerView.Adapter<ReviewViewHolder> {
    private Reviews mReviews;

    public ReviewAdapter(Reviews reviews) {
        this.mReviews = reviews;
    }

    @Override
    public ReviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.review_list_item, parent, false);

        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewViewHolder holder, int position) {
        final Review review = mReviews.getResults().get(position);

        holder.mTvReviewAuthor.setText(review.getAuthor());
        holder.mTvReviewContent.setText(review.getContent());
    }

    @Override
    public int getItemCount() {
        return mReviews.getResults().size();
    }

}
