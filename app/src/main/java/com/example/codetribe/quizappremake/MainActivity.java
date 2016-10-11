package com.example.codetribe.quizappremake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToSports(View view)
    {
        Intent intent = new Intent(this,SportsActivity.class);
        startActivity(intent);
    }
    public void goToMind(View view)
    {
        Intent intent = new Intent(this,MindActivity.class);
        startActivity(intent);
    }

    public void goToPuzzle(View view)
    {
        Intent intent = new Intent(this,PuzzleActivity.class);
        startActivity(intent);
    }
}
