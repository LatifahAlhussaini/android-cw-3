package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Cartoon> CartoonLaibrary = new ArrayList<>() ;

        Cartoon A = new Cartoon("My Daddy Long Legs",8.2,1,40,1990,R.drawable.mydaddylonglegs);
        Cartoon B = new Cartoon("UFO Robot Goldrake",7,1,74,1975,R.drawable.ufo);
        Cartoon C = new Cartoon("Popeye the Sailor",7.1,25,220,1960,R.drawable.popeyethesailor);
        Cartoon D = new Cartoon("Bumpety Boo",6.2,1,130,1985,R.drawable.bumpetyboo);
        Cartoon E = new Cartoon("Sangokushi",8.9,1,47,1971,R.drawable.sangokushi);
        Cartoon F = new Cartoon("Adnan and Lina",8.7,1,26,1978,R.drawable.adnanandlina);


        CartoonLaibrary.add(A);
        CartoonLaibrary.add(B);
        CartoonLaibrary.add(C);
        CartoonLaibrary.add(D);
        CartoonLaibrary.add(E);
        CartoonLaibrary.add(F);


        RecyclerView CartoonList = findViewById(R.id.RV);

        CartoonList.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        CartoonList.setLayoutManager(lm);

        CartoonAdapter CA = new CartoonAdapter(CartoonLaibrary,MainActivity.this);
        CartoonList.setAdapter(CA);


    }
}