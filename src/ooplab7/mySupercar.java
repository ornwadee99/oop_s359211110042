package ooplab7;

import java.util.Scanner;

public class mySupercar {
    public static void main(String[] args) {
        SuperCar b = new SuperCar();
        b = inputData(b);
        b.getSupercarInfo();

    }//main

    private static SuperCar inputData(SuperCar b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Supercar info: ");
        System.out.print("Enter Supercar carbrand: ");
        b.setCarbrand(scanner.nextLine());
        System.out.print("Enter Supercar carcolcor: ");
        b.setCarcolor(scanner.nextLine());
        System.out.print("Enter Supercar cerenginesize: ");
        b.setCerenginesize(scanner.nextLine());
        System.out.print("Enter Supercar maxspeed: ");
        b.setMaxspeed(scanner.nextLine());
        System.out.print("Enter Supercar countryoforigin: ");
        b.setCountryoforigin(scanner.nextLine());
        return  b;


    }




    }//class



