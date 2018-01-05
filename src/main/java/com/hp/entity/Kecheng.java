package com.hp.entity;

public class Kecheng {
    int g_id;
    String g_name;

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    @Override
    public String toString() {
        return "Kecheng{" +
                "g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                '}';
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }
}
