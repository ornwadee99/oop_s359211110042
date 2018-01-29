package ooplab8;

public class Cat extends Pet {
    public Cat(String name, String haircolor, String gender, int age) {
        super(name, haircolor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meaw Meaw !!!");
    }
}//class
