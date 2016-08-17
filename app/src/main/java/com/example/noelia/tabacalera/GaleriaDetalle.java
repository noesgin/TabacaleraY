package com.example.noelia.tabacalera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;


public class GaleriaDetalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_galeria_detalle);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        GaleriaAdapter imageAdapter = new GaleriaAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageGaleriaDetalle);

    }
}

