package com.jf2mc1.a015001ahelloworldapp;

import android.content.Context;
import android.util.Log;

public class Lion extends Animal{

    public int age = 1;
    private int weight = 5;
    public boolean isWild = false;




    interface AttackListener {

        void lionHasAttacked();

    }

    AttackListener mAttackListener;

    public static int numberOfLions;

    public Lion(String name, String color, int age, float weight,
                int numberOfHands, int numberOfLegs) {
        super(name, color, age, weight, numberOfHands, numberOfLegs);
    }

    public Lion(Context context) {
        super("", "", 0, 0F, 0, 0);

        numberOfLions++;
        if(context instanceof AttackListener) {
            mAttackListener = (AttackListener) context;
        }
    }

    public void attack() {
        Log.i("SPY", "Lion has attacked");
        mAttackListener.lionHasAttacked();

    }


}
