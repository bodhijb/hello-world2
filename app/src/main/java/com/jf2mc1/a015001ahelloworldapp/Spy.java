package com.jf2mc1.a015001ahelloworldapp;

import android.util.Log;

public class Spy extends Person implements Lion.AttackListener {

//    private String name;
    private int id;

    public Spy(int id) {
//        this.name = name;
        this.id = id;

    }

//    public String getName() {
//        return name;
//    }

    public int getId() {
        return id;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void lionHasAttacked() {
        Log.i("SPYIN SPY", "Now the " + this.name + " knows the lion has attacked");
    }
}
