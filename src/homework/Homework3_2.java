package homework;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        int id = getID();
        String name = getName();
        float salary = getSalary();
        float overtime = getOverTime();
        showData(id, name, salary, overtime);
    }
    private static  int getID() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int ID = in.nextInt();
        return ID;
    }
    private  static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Name : ");
        String name = in.nextLine();
        return name;
    }
    private static float getSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Salary : ");
        float salary = in.nextFloat();
        return salary;
    }
    private static float getOverTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you overtime :");
        float overtime = in.nextFloat();
        return overtime;
    }
    private static int calculateTax(float a,float b) {
        float sum = b+a;
        if (sum>=100000) {
            return 10;
        }
        else  if (sum>=70000) {
            return 7;
        }
        else  if (sum>=50000) {
            return 5;
        }
        else if (sum>=30000) {
            return 3;
        }
        else {
            return 1;
        }
        }
    private static  void showData(int id,String name, float salary, float overtime){
        Homework3_2 x = new Homework3_2();
        System.out.println("ID :"+ id);
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+ salary);
        System.out.println("OverTime : "+ overtime);
        System.out.println("Tax is : " + x.calculateTax(salary,overtime)+"%");


    }//main
}//class
