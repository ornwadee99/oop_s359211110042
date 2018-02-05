package ooplab9;

import ooplab8.Pet;

public class Cow extends Pet{
    public Cow(String name, String haircolor, String gender, int age) {
        super(name, haircolor, gender, age);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Mor Mor !!!");
    }
}//class
