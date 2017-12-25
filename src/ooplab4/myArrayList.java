package ooplab4;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("bam");
        System.out.println(myList);
        myList.add("Ploy");
        myList.add("Tan");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
        myList.set(0,"Ornwadee");
        System.out.println(myList);
        myList.remove("Hello"); //ลบ
        System.out.println(myList);
        System.out.println(myList.indexOf(100));




    }//main

}//calss
