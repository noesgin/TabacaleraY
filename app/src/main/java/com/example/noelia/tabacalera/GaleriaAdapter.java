package com.example.noelia.tabacalera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Noelia on 13/08/2016.
 */

public class GaleriaAdapter extends BaseAdapter {
    private Context context;

    public GaleriaAdapter(Context context) {
        this.context=context;
    }

    public int getCount() {
        return GaleriaDataProvider.ITEMS.length;
    }
    @Override
    public GaleriaDataProvider getItem(int position) {
        return GaleriaDataProvider.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getIdDrawable();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.galeria_item, viewGroup, false);
        }
        ImageView imagenGaleria = (ImageView) view.findViewById(R.id.imageGallery);

        final GaleriaDataProvider item = getItem(position);
        imagenGaleria.setImageResource(item.getIdDrawable());

        return view;
    }
}
