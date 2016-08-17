package com.example.noelia.tabacalera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

public class Talleres extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] t_name,t_horario;

    int[] img_res = {R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};


    ArrayList<TalleresDataProvider> arrayList = new ArrayList<TalleresDataProvider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_talleres);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        t_name = getResources().getStringArray(R.array.taller_titulos);
        t_horario = getResources().getStringArray(R.array.taller_horarios);

            int i = 0;
            for (String name : t_name) {
                if(i<img_res.length){
                TalleresDataProvider dataProvider = new TalleresDataProvider(img_res[i],t_horario[i], name);
                arrayList.add(dataProvider);
                 i++;
            }
        }
        adapter = new TalleresRecyclerAdapter(arrayList, this);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setClickable(true);
    }
}
