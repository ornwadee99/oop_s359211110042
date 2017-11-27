package ooplab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalGrade {
//    score 0-49 grade F
//    score 50-59 grade D
//    score 60-69 grade C
//    score 70-79 grade B
//    score 80-100 grade A
    public static void main(String[] args) {
//        BufferedReader
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter Your Score: ");
        int R = 70;

        if (R<=50){
            System.out.println("Your grade F");
        }
        else if (R<=59){
            System.out.println("Your grade D");
        }
        else if (R<=69) {
            System.out.println("Your grade C");
        }
        else if (R<=79) {
            System.out.println("Your grade B");
        }
        else {
            System.out.println("Your grade A");
        }
        }//main

    }//class











