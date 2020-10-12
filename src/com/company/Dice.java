package com.company;

public class Dice {

    public int value;

    public void generateRandomValue() {
        value = (int) (Math.random()*6+1);
    }

    public void setValue(int value) {
        this.value = value;
    }
}