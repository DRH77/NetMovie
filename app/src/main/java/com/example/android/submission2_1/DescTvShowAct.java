package com.example.android.submission2_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DescTvShowAct extends AppCompatActivity {

    ImageView tvshowdescPhoto;
    TextView tvshowdescName, tvshowdescDuration, tvshowdescRating, tvshowdescDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_tvshow);

        Intent intent = getIntent();

        final String name_tvshow = intent.getExtras ( ).getString ( "name" );
        final String photo_tvshow = intent.getExtras ( ).getString ( "photo" );
        final String duration_tvshow = intent.getExtras ( ).getString ( "duration" );
        final String rating_tvshow = intent.getExtras ( ).getString ( "rating" );
        final String desc_tvshow = intent.getExtras ( ).getString ( "desc" );


        tvshowdescName = findViewById ( R.id.tvshow_desc_name );
        tvshowdescPhoto = findViewById ( R.id.tvshow_desc_photo );
        tvshowdescDuration = findViewById ( R.id.tvshow_desc_duration );
        tvshowdescRating = findViewById ( R.id.tvshow_desc_rating );
        tvshowdescDesc = findViewById ( R.id.tvshow_desc_desc);



        Glide.with(this).load(photo_tvshow).into(tvshowdescPhoto);
        tvshowdescName.setText(name_tvshow);
        tvshowdescDuration.setText(duration_tvshow);
        tvshowdescRating.setText (rating_tvshow);
        tvshowdescDesc.setText(desc_tvshow);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Detail Tv Show");
        }
    }
}
