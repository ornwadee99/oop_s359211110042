package ooplab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myArray2D {
    public static void main(String[] args) throws IOException {
        int num[][] = new int[2][3];
//        num [0][0] = 1;
//        num [0][1] = 2;
//        num [0][2] = 3;
        num = inputDAta2D(num);
        showData(num);
    }//main

    private static void showData(int[][] num) {
            System.out.print("DAta in array 2D: ");
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
    }//j
             System.out.println();
            }//i
            System.out.println();
        }//showdata2D
        private static int[][] inputDAta2D(int[][] num) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter as integer: ");
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print("num[" + i + "][" + j + "]: ");
                    num[i][j] = Integer.parseInt(reader.readLine());
                }//j
            }//i
            return num;
        }//input
}//class
