package com.example.noelia.tabacalera;

/**
 * Created by Noelia on 13/08/2016.
 */

public class GaleriaDataProvider {
    private int idDrawable;

    public GaleriaDataProvider(int idDrawable){
        this.idDrawable=idDrawable;
    }

    public int getIdDrawable(){
        return idDrawable;
    }


    public int getCount() {
        return ITEMS.length;
    }

    public static GaleriaDataProvider[] ITEMS = {
            new GaleriaDataProvider(R.mipmap.ic_launcher),
            new GaleriaDataProvider(R.mipmap.ic_launcher),
            new GaleriaDataProvider(R.mipmap.ic_launcher),
            new GaleriaDataProvider(R.mipmap.ic_launcher),
            new GaleriaDataProvider(R.mipmap.ic_launcher),
            new GaleriaDataProvider(R.mipmap.ic_launcher)

    };

    public static GaleriaDataProvider getItem(int position) {
        for (GaleriaDataProvider item : ITEMS) {
            if (item.getIdDrawable() == position) {
                return item;
            }
        }
        return null;
    }
}
