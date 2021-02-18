package com.jf2mc1.a015001ahelloworldapp;

public abstract class Animal {

    private String name;
    private String color;
    private int age;
    private float weight;
    private int numberOfHands;
    private int numberOfLegs;

    public Animal(String name, String color, int age, float weight, int numberOfHands, int numberOfLegs) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.numberOfHands = numberOfHands;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumberOfHands() {
        return numberOfHands;
    }

    public void setNumberOfHands(int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
