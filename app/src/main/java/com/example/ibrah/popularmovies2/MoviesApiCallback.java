package com.example.ibrah.popularmovies2;

public interface MoviesApiCallback<T> {
    void onResponse(T result);

    void onCancel();
}