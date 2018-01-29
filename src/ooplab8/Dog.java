package ooplab8;
//Dog is sub-class
//Pet is super-class
public class Dog extends Pet{
    public Dog(String name, String haircolor, String gender, int age) {
        super(name, haircolor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class
