package com.example.ratingbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    RatingBar ratingBar;
    TextView tvRating;
    float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        tvRating = findViewById(R.id.tvRating);
        ratingBar.setOnRatingBarChangeListener(this);
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        rating = ratingBar.getRating();
        tvRating.setText(String.valueOf(rating));
    }
}
