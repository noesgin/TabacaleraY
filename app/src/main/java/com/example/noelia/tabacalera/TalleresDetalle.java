package com.example.noelia.tabacalera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class TalleresDetalle extends AppCompatActivity {
    ImageView imageView;
    TextView t_name,t_horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_talleres_detalle);

        imageView = (ImageView) findViewById(R.id.TallerImageDetalle);
        t_name = (TextView) findViewById(R.id.TallerTextName);
        t_horario = (TextView) findViewById(R.id.TallerTextDetalle);
        imageView.setImageResource(getIntent().getIntExtra("img_id", 00));
        t_name.setText(getIntent().getStringExtra("name"));
        t_horario.setText(getIntent().getStringExtra("horario"));
    }
}
