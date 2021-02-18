package com.jf2mc1.a015001ahelloworldapp;

import android.graphics.Color;
import android.view.View;

public class MyClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        view.setBackgroundColor(Color.YELLOW);

    }
}
