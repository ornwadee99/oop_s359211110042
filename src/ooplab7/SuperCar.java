package ooplab7;

import java.util.Scanner;

public class SuperCar {
    private  String carBrand;
    private  String carColor;
    private  String carengSize;
    private  String Maxspeed;
    private String Countryoforigin;
    //constructor
    public  SuperCar(){}
    public  SuperCar(String b,String c,String e,String a,String n,String p){
        this.carBrand = b;
        this.carColor = c;
        this.carengSize = e;
        this.Maxspeed = n;
        this.Countryoforigin = p;
    }
        public  String getCarColor(){
            return  carColor;
        }

        public void setCarColor(String carColor ){
            this.carColor = carColor;
        }
        public String getCarBrand(){
            return this.carBrand;
        }

        public void setCarBrand(String carBrand){
            this.carBrand = carBrand;
        }

        public String getCarEngSize(){
            return  carengSize;
        }
        public void setEngSize (String engSize){
            this.carengSize = engSize;
        }

         public String getMaxspeed(){
        return Maxspeed;
        }
         public void  setMaxspeed (String Maxspeed){
        this.Maxspeed = Maxspeed;
        }
         public String getCountryoforigin(){
        return Countryoforigin;
        }
        public void  setCountryoforigine (String Countryoforigin){
        this.Countryoforigin = Countryoforigin;
        }

         public String getSuperCarInfo() {
             return "SuperCar{" +
                     "carBrand='" + carBrand + '\'' +
                     ", carColor='" + carColor + '\'' +
                     ", engSize='" + carengSize + '\'' +
                     ", Maxspeed='" + Maxspeed + '\'' +
                     ", Countryoforigin='" + Countryoforigin+ '\'' +
                     '}';


         }


}//class
