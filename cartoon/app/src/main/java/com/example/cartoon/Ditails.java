package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Ditails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ditails);

        Bundle B = getIntent().getExtras();
        Cartoon C = (Cartoon) B.getSerializable("Cartoon");

        ImageView img = findViewById(R.id.dimage);
        TextView name = findViewById(R.id.dname);
        TextView rating = findViewById(R.id.drating);
        TextView season = findViewById(R.id.dseason);
        TextView episodes = findViewById(R.id.depisodes);
        TextView year = findViewById(R.id.dyear);

        img.setImageResource(C.getImage());
        name.setText(C.getName());
        rating.setText(C.getRating()+"");
        season.setText(C.getSeason()+"");
        episodes.setText(C.getEpisodes()+"");
        year.setText(C.getYear()+"");



    }
}