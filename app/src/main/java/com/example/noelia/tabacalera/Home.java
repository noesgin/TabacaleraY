package com.example.noelia.tabacalera;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Home extends AppCompatActivity {


    static TextView mDotsText[];
    private int mDotsCount;
    private LinearLayout mDotsLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);

        vistas();

        //here we create the gallery and set our adapter created before
        Gallery gallery = (Gallery)findViewById(R.id.gallery);
        gallery.setAdapter(new HomeImageAdapter(this));



        mDotsLayout = (LinearLayout)findViewById(R.id.image_count);
        //here we count the number of images we have to know how many dots we need
        mDotsCount = gallery.getAdapter().getCount();

        //here we create the dots
        //as you can see the dots are nothing but "."  of large size
        mDotsText = new TextView[mDotsCount];

        //here we set the dots
        for (int i = 0; i < mDotsCount; i++) {
            mDotsText[i] = new TextView(this);
            mDotsText[i].setText(".");
            mDotsText[i].setTextSize(40);
            mDotsText[i].setTypeface(null, Typeface.BOLD);
            mDotsText[i].setTextColor(android.graphics.Color.GRAY);
            mDotsLayout.addView(mDotsText[i]);

        }

        //when we scroll the images we have to set the dot that corresponds to the image to White and the others
        //will be Gray
        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView adapterView, View view, int pos, long l) {

                for (int i = 0; i < mDotsCount; i++) {
                    Home.mDotsText[i]
                            .setTextColor(Color.GRAY);

                }

                Home.mDotsText[pos]
                        .setTextColor(Color.BLUE);
            }

            @Override
            public void onNothingSelected(AdapterView adapterView) {

            }
        });


    }

    private void vistas(){
        String classNames[] = {"Talleres", "Eventos", "Galeria", "Noticias"};

        ListAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classNames);

        ListView listview=(ListView)findViewById(R.id.listView);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String textPosition=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(Home.this, textPosition, Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    Intent intent = new Intent(Home.this, Talleres.class);
                    startActivity(intent);
                }

                else if(position==1){
                    Intent intent = new Intent(Home.this, Eventos.class);
                    startActivity(intent);
                }

                else if(position==2){
                    Intent intent = new Intent(Home.this, Galeria.class);
                    startActivity(intent);
                }

                else if(position==3){
                    Intent intent = new Intent(Home.this, Noticias.class);
                    startActivity(intent);
                }

            }
        });
    }

}
