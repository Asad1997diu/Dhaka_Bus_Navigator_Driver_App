package com.example.localtransportationtrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class ImageActivity extends AppCompatActivity{
    ImageView full_imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        full_imageview = findViewById(R.id.full_image_id);
        Glide.with(this).load(getIntent().getStringExtra("images")).diskCacheStrategy(DiskCacheStrategy.ALL).into(full_imageview);

    }
}