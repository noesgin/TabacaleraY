package com.example.noelia.tabacalera;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Noticias extends AppCompatActivity {
    ViewPager viewPager;
    NoticiasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_noticias);

        viewPager = (ViewPager)findViewById(R.id.view_pager);
    /*    adapter = new NoticiasAdapter(this);
        viewPager.setAdapter(adapter);*/

        viewPager.setAdapter(new NoticiasAdapter(this));
    }
}
