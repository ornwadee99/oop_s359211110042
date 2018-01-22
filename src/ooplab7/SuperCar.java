package ooplab7;

public class SuperCar {
    public void getSupercarInfo (){
        System.out.println("Super info: ");
        System.out.println("carbrand: "+this.carbrand);
        System.out.println("carcolor: "+this.carcolor);
        System.out.println("cerenginesize: "+this.cerenginesize);
        System.out.println("maxspeed: "+this.maxspeed);
        System.out.println("countryoforigin: "+this.countryoforigin);
    }
    private String carbrand;
    private String carcolor;
    private String cerenginesize;
    private String maxspeed;
    private String countryoforigin;

    public SuperCar (){}
    public SuperCar (String b,String c,String r,String m,String t){
        this.carbrand = b;
        this.carcolor = c;
        this.cerenginesize = r;
        this.maxspeed = m;
        this.countryoforigin = t;
    }

        public void setCarbrand(String carbrand ){
            this.carbrand = carbrand;
        }//setcerbrand
        public String getCarbrand(){
            return this.carbrand;
        }//getcerbrand

        public void setCarcolor(String carcolor){
            this.carcolor = carcolor;
        }//setcercolor
        public String getCarcolor(){
            return this.carcolor;
        }//getcarcolcor

        public void setCerenginesize(String cerenginesize){
            this.cerenginesize = cerenginesize;
        }//setcerenginesize
        public String getCerenginesize(){
            return  this.cerenginesize;
        }//getcerenginesize

        public void setMaxspeed(String s){
            this.maxspeed = maxspeed;
        }//setmaxspeed
        public String getMaxspeed(){
            return  this.maxspeed;
        }//getmaxpeed

        public void setCountryoforigin(String countryoforigin){
            this.countryoforigin = countryoforigin;
        }//setcountryoforigin
        public String getCountryoforigin(){
            return this.countryoforigin;
        }//getcountryoforigin




}//class
