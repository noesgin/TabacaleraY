package com.example.noelia.tabacalera;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Noelia on 13/08/2016.
 */

public class TalleresRecyclerAdapter extends RecyclerView.Adapter<TalleresRecyclerAdapter.RecyclerViewHolder> {
    ArrayList<TalleresDataProvider> arrayList = new ArrayList<TalleresDataProvider>();
    Context ctx;

    public TalleresRecyclerAdapter(ArrayList<TalleresDataProvider> arrayList, Context ctx) {
        this.arrayList = arrayList;
        this.ctx = ctx;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.talleres_item, parent, false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(itemView, ctx, arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        TalleresDataProvider dataprovider=arrayList.get(position);
        holder.imageView.setImageResource(dataprovider.getImg());
        holder.t_name.setText(dataprovider.getT_name());
        holder.t_horario.setText(dataprovider.getT_horario());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView t_name,t_horario;
        ArrayList<TalleresDataProvider> talleres = new ArrayList<TalleresDataProvider>();
        Context ctx;

        public RecyclerViewHolder(View itemLayoutView, Context ctx, ArrayList<TalleresDataProvider> talleres){
            super(itemLayoutView);

            this.talleres = talleres;
            this.ctx = ctx;
            itemLayoutView.setOnClickListener(this);
            imageView=(ImageView)itemLayoutView.findViewById(R.id.img);
            t_name=(TextView)itemLayoutView.findViewById(R.id.t_name);
            t_horario=(TextView)itemLayoutView.findViewById(R.id.t_horario);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            TalleresDataProvider taller = this.talleres.get(position);
            Intent intent = new Intent(ctx, TalleresDetalle.class);
            intent.putExtra("img_id", taller.getImg());
            intent.putExtra("name", taller.getT_name());
            intent.putExtra("horario", taller.getT_horario());
            this.ctx.startActivity(intent);
        }
    }
    //////////////////////////////////
    public static class EventosViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageEventos;
        TextView e_name,e_fecha;
        ArrayList<EventosDataProvider> eventos = new ArrayList<EventosDataProvider>();
        Context ctx;

        public EventosViewHolder(View itemLayoutView, Context ctx, ArrayList<EventosDataProvider> eventos) {
            super(itemLayoutView);

            this.eventos = eventos;
            this.ctx = ctx;
            itemLayoutView.setOnClickListener(this);
            imageEventos=(ImageView)itemLayoutView.findViewById(R.id.imgEvento);
            e_name=(TextView)itemLayoutView.findViewById(R.id.e_name);
            e_fecha=(TextView)itemLayoutView.findViewById(R.id.e_fecha);
        }

        @Override
        public void onClick(View view) {

        }
    }
}


