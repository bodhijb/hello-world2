package com.jf2mc1.a015001ahelloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, Lion.AttackListener {

    String name = "Mory";
    int myNumber;

    /**
     * A formatted comment
     * @param savedInstanceState dont know
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<Integer, String> myKeyValuePair = new HashMap<>();
        myKeyValuePair.put(1, "Value 1");
        myKeyValuePair.put(2, "Value 2");
        myKeyValuePair.put(3, "Value 3");
        myKeyValuePair.put(4, "Value 4");
        myKeyValuePair.put(5, "Value 5");
        myKeyValuePair.put(6, "Value 6");
        myKeyValuePair.put(7, "Value 7");

        Set set = myKeyValuePair.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry myEntry = (Map.Entry) iterator.next();
            Log.i("MAP", "This is Key " + myEntry.getKey());
            Log.i("MAP", "This is Value " + myEntry.getValue());

        }

        String value4 =myKeyValuePair.get(4);
        Log.i("VALUE4", value4);

        myKeyValuePair.remove(4);

        Set set2 = myKeyValuePair.entrySet();
        Iterator iterator2 = set2.iterator();

        while(iterator2.hasNext()) {
            Map.Entry myEntry = (Map.Entry) iterator2.next();
            Log.i("MAP", "This is Key " + myEntry.getKey());
            Log.i("MAP", "This is Value " + myEntry.getValue());

        }




//        Spy spy1 =new Spy(1);
//        Spy spy2 =new Spy(2);
//        Spy spy3 =new Spy(3);
//        Spy spy4 =new Spy(4);
//        Spy spy5 =new Spy(5);
//        Spy spy6 =new Spy(6);
//
//        ArrayList<Spy> spies = new ArrayList<>(6);
//        spies.add(spy1);
//        spies.add(spy2);
//        spies.add(spy3);
//        spies.add(spy4);
//        spies.add(spy5);
//        spies.add(spy6);
//        spies.add(new Spy(7));
//
//        Log.i("LIST", spies + "");
//        for(Spy spy: spies) {
//            Log.i("LIST", String.valueOf(spy.getId()));
//        }

//        List<Tiger> tigers = new ArrayList<>();
//        tigers.add(new Tiger("A", "Orange", 20, 70, 2, 2));
//        tigers.add(new Tiger("B", "Orange", 20, 70, 2, 2));
//        tigers.add(new Tiger("C", "Orange", 20, 70, 2, 2));
//        tigers.add(new Tiger("D", "Orange", 20, 70, 2, 2));
//        tigers.add(new Tiger("E", "Orange", 20, 70, 2, 2));
//        tigers.add(new Tiger("F", "Orange", 20, 70, 2, 2));
//
//        for(Tiger tiger: tigers){
//            Log.i("TIGER",tiger.getName());
//        }


//        Toast.makeText(this, "onCreate is called", Toast.LENGTH_LONG).show();

        /**
         * onclick listener using a class that implements OCL interface
         */
//        findViewById(R.id.button).setOnClickListener(
//                new MyClickListener());

        /**
         * MainActivity implements OCL interface
         */
//        findViewById(R.id.button).setOnClickListener(MainActivity.this);

        /**
         * OCL using anonymous inner class
         */
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.setBackgroundColor(Color.GREEN);
//                findViewById(R.id.ll).setBackgroundColor(Color.YELLOW);
//                Toast.makeText(MainActivity.this, "Anonymous inner class clicked", Toast.LENGTH_LONG).show();
//            }
//        });

//        Lion lion1 = new Lion(this);
//        Lion lion2 = new Lion(this);
//        Lion lion3 = new Lion(this);
//        Lion lion4 = new Lion(this);
//        Lion lion5 = new Lion(this);
//
//        lion2.numberOfLions = 2;
//        lion2.attack();
//
//        Spy mySpy = new Spy(123);
//        mySpy.lionHasAttacked();
//
//        Tiger myTiger = new Tiger("A Tiger", "Orange",
//                10,50.8F, 2,2);
//
//        Log.i("TIGER", myTiger.getName());


//        Log.i("LION", "There are " + Lion.numberOfLions
//        + " Lion Objects created so far!");
//
//        Lion lion6 = new Lion(this);
//        Lion lion7 = new Lion(this);
//        Lion lion8 = new Lion(this);
//        Lion lion9 = new Lion(this);
//        Lion lion10 = new Lion(this);
//        lion10.numberOfLions = 0;
//
//        Log.i("LION", "There are " + Lion.numberOfLions
//                + " Lion Objects created so far!");







    }

    @Override
    public void onClick(View view) {
        view.setBackgroundColor(Color.CYAN);

    }

//    public void buttonIsClicked(View buttonView) {
//        buttonView.setBackgroundColor(Color.RED);
//        findViewById(R.id.ll).setBackgroundColor(Color.BLUE);
//        Toast.makeText(this, "The button is clicked", Toast.LENGTH_LONG).show();
//
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart is called", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume is called", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause is called", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop is called", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy is called", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart is called", Toast.LENGTH_LONG).show();

    }


    @Override
    public void lionHasAttacked() {
        Log.i("MAINACT", "Now Main knows the lion has attacked");

    }
}