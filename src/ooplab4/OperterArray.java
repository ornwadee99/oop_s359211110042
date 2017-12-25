package ooplab4;

public class OperterArray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        int num2[] = num;
        int num3[] = {1,2,3,4,5};
        if(num==num3)
            System.out.println("true");
        else
            System.out.println("fale");
        if(num==num2)
            System.out.println("true");
        else
            System.out.println("fale");
        num[0] = 100;
        System.out.println(num2[0]);
        num2[4] = 500;
        System.out.println(num[4]);



    }//main


}//class
