package com.example.adibha.phlaven;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import static com.example.adibha.phlaven.R.id.imageView;

public class LearningPath extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_path);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView view= (ImageView)findViewById(imageView);
        view.setImageDrawable(getDrawable(R.mipmap.sample_graph));
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    }

}
