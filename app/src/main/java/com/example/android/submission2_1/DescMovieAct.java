package com.example.android.submission2_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DescMovieAct extends AppCompatActivity {

    ImageView moviedescPhoto;
    TextView moviedescName, moviedescDuration, moviedescRating, moviedescDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_movie);

        Intent intent = getIntent();

        final String name_movie = intent.getExtras ( ).getString ( "name" );
        final String photo_movie = intent.getExtras ( ).getString ( "photo" );
        final String duration_movie = intent.getExtras ( ).getString ( "duration" );
        final String rating_movie = intent.getExtras ( ).getString ( "rating" );
        final String desc_movie = intent.getExtras ( ).getString ( "desc" );


        moviedescName = findViewById ( R.id.movie_desc_name );
        moviedescPhoto = findViewById ( R.id.movie_desc_photo );
        moviedescDuration = findViewById ( R.id.movie_desc_duration );
        moviedescRating = findViewById ( R.id.movie_desc_rating );
        moviedescDesc = findViewById ( R.id.movie_desc_desc);



        Glide.with(this).load(photo_movie).into(moviedescPhoto);
        moviedescName.setText(name_movie);
        moviedescDuration.setText(duration_movie);
        moviedescRating.setText (rating_movie);
        moviedescDesc.setText(desc_movie);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Detail Movie");
        }
    }
}
