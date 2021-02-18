package com.jf2mc1.a015001ahelloworldapp;

public class Person {

    protected String name;
    protected int age;
    protected float weight;


    public Person() {
/*        name = "John";
        age = 12;
        weight = 34.7f;*/

        this("John", 12, 34.7f);
    }

    public Person(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }


}
