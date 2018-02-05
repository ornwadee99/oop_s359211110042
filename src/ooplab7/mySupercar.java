package ooplab7;

import java.util.Scanner;

public class mySupercar {
    public static void main(String[] args) {
        Scanner<SuperCar> myCarList = new Scanner<SuperCarr>();
        myCarList = inputData(myCarList);
        System.out.println("== Show Super Car Info ==");
        for (int i = 0; i < myCarList.size(); i++) {
            System.out.println(myCarList.get(i).getSupercar());
        }
    }

    private static Scanner inputData(Scanner myCarList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Supercar info: ");
        for (int i =0;i<2;i++){
        System.out.print("Super car: "+(i+1));
        System.out.print("Brand: ");
        String b = scanner.nextLine();
        System.out.print("Color: ");
        String c = scanner.nextLine();
        System.out.print("Engine Size: ");
        String e = scanner.nextLine();
        System.out.print("Cerenginesize: ");
        String a = scanner.nextLine();
        System.out.print("Maxspeed: ");
        String n = scanner.nextLine();
        System.out.print("Countryoforigin: ");
        String p = scanner.nextLine();

        SuperCar car = new SuperCar(b,c,e,a,n,p);
        myCarList.add(car);

    }
        return   myCarList;
}


    }//class



