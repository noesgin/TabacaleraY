package com.example.noelia.tabacalera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_galeria);

        GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(new GaleriaAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

             /*   GaleriaDataProvider item = (GaleriaDataProvider)parent.getItemAtPosition(position);*/
                Intent i = new Intent(Galeria.this, GaleriaDetalle.class);
                i.putExtra("id",position);

                startActivity(i);

                // Toast para mostrar un mensaje. Escribe el nombre de tu clase
                // si no la llamaste MainActivity.
                // Al hacer click, esta mensaje muestra la posición

             /*   Toast.makeText(Galeria.this, "" + position, Toast.LENGTH_SHORT)
                        .show();
*/
            }
        });
    }
}
