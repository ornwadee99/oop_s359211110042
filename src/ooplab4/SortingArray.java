package ooplab4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//1. allow user input data array: inputData,showData
//2. find summation of data in array
//3. fing average value in array
//4. find maximum value in array
//5. find minimum value in array
//6. sorting data in array (Descending order)
//7. sorting data in array (Ascending order)

public class SortingArray {
    private  static  int MAX = 5;
    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        num = inputData(num);
        showData(num);
        findSummation(num);
        findMax(num);
        DescendingOrder(num);
        AscendingOrder(num);


    }//main

    private static void AscendingOrder(Integer[] num) {
        System.out.println("Ascending Order: ");
        Arrays.sort(num,Collections.reverseOrder());
        showData(num);
    }//AscendingOrder

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.println("Descending Order: ");
        showData(num); //showData(Array.sort(num));
    }//DeacendingOrder

    private static void findSummation(Integer[] num) {
        System.out.println("The Mininum value is: "+
        Collections.min(Arrays.asList(num))); //หาค่าน้อยสุด
    }

    private static void findMax(Integer[] num) {
        System.out.println("The Maxnum value is: "+
        Collections.max(Arrays.asList(num))); //หาค่ามากสุด
    }//findMax

    private static void showData(Integer[] num) {
        Integer total=0;
        for (int val:num)
            total+=val;
        System.out.println("The summation is : "+total); // หาค่าผลรวมข้อมูลที่อยู่ในอาเรย์ทั้งหมด
        findAverage(total);
    }//findSummation
    private static void  findAverage (Integer total){
    System.out.println("The Average  is: "+total/MAX);
    }

        private  static Integer[] showData (Integer[] num){
            System.out.println("Data in Array: ");
            //enhance loop
            for (int i : num) {
                System.out.println(i + "");
    }
            System.out.println();
            return num;
        }


    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();

        }



}//class
