package com.example.energy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class introactivity extends AppCompatActivity {
    private ViewPager screenpager;
    intoview intoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<screenitem> mList = new ArrayList<>();
        mList.add(new screenitem("Dyuga","",R.drawable.dyugalogo));
        mList.add(new screenitem("Dyuga","",R.drawable.ddd));
        mList.add(new screenitem("Dyuga","",R.drawable.d));


        screenpager = findViewById(R.id.screen);
        intoview = new intoview(this,mList);
        screenpager.setAdapter(intoview);
    }
}