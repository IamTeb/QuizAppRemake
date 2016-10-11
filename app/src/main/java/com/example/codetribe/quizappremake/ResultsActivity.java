package com.example.codetribe.quizappremake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends AppCompatActivity {

    TextView txt1, txt2;
    int point = 0, Qu = 0;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        txt1 = (TextView) findViewById(R.id.total);
        txt2 = (TextView) findViewById(R.id.QuesRating);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        point = Integer.parseInt(getIntent().getExtras().getString("Score"));
        Qu = Integer.parseInt(getIntent().getExtras().getString("Qu"));
        double percent = ((double) point / Qu) * 100;
        txt1.setText("" + percent + "%");

        txt2.setText("" + point + "/" + Qu);
        ratingBar.setRating(point);

    }
    public void goToHome(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
