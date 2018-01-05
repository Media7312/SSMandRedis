package com.hp.entity;

import java.util.List;

public class Classes {
    int c_id;
    String c_name;
    List<Student> Slist;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public List<Student> getSlist() {
        return Slist;
    }

    public void setSlist(List<Student> slist) {
        Slist = slist;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", Slist=" + Slist +
                '}';
    }
}
