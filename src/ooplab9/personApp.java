package ooplab9;

public class personApp {
    public static void main(String[] args) {
        Address p = new Address("235","Trang","80000");
        Job b = new Job("secretary","12000");

        person r = new person("ornwadee","042",p,b);

        System.out.println(r.toString());


    }//main
}//class
