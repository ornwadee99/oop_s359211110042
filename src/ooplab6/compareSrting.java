package ooplab6;

public class compareSrting {
    public static void main(String[] args) {
        //compare Sring
        String m = "Hello";
        String n = "Hello";
        //type 1 (==)
        if (m==n) System.out.println("yes.");
        else System.out.println("no.");
        //type 2 (equal())
        if (m.equals(n)) System.out.println("yes.");
        else System.out.println("no.");
        //type 3 (compareTo())
        if (m.compareTo(n)==0) System.out.println("yes.");
        else if (m.compareTo(n)>= 1)
            System.out.println("no. +");
        else System.out.println("no. -");



    }//main
}//class
