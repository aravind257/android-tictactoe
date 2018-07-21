package com.example.arashyla.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void insertClick(View view){
        ImageView userClicked = (ImageView) findViewById(R.id.imageView1);
        userClicked.setImageResource(R.drawable.x);
        userClicked.animate().translationY(1000f);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
