package homework;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Homework3_1 b = new Homework3_1();
        for (int i = 1; i < 4 ; i++ ) {
            System.out.print("Enter yaer" + i + " :");
            int a = in.nextInt();
            System.out.println("Age " + i + ": " + b.formula(a));
        }
        System.out.println("Thank you. ");

        }
        public int formula(int b){
        int sum;
        return  sum = 2561-b;
    }
}
