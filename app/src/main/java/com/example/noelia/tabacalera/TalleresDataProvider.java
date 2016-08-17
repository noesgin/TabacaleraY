package com.example.noelia.tabacalera;

/**
 * Created by Noelia on 13/08/2016.
 */

public class TalleresDataProvider {
    private int img;
    private String t_name, t_horario;

    public TalleresDataProvider(int img, String t_horario, String t_name) {
        this.setImg(img);
        this.setT_name(t_name);
        this.setT_horario(t_horario);
    }


    public int getImg() {
        return img;
    }

    public String getT_horario() {
        return t_horario;
    }

    public String getT_name() {
        return t_name;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setT_horario(String t_horario) {
        this.t_horario = t_horario;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}
