package com.example.chandanrkote.chandanpro;

import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.ListView;

import com.github.chrisbanes.photoview.PhotoView;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class CalenderActivity extends AppCompatActivity {

    /*ImageView imageView;
    PhotoViewAttacher mAttacher;*/


    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);


        setupUIViews();
        initToolbar();

        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.d);


        /*imageView = (ImageView) findViewById(R.id.ivcalender);
        Drawable bitmap = getResources().getDrawable(R.drawable.d);
        imageView.setImageDrawable(bitmap);
        mAttacher = new PhotoViewAttacher(imageView);*/
    }

    private void setupUIViews(){
        toolbar = (Toolbar)findViewById(R.id.ivcalender);

    }




    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("calender of events");

    }




}
