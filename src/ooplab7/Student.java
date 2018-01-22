package ooplab7;

public class Student {
        private  String id;
        private  String name;
        private  String major;
        private  String group;

        //construtor
        //defult
        public Student () {}
        public Student (String id,String n,String m,String g){
            this.id = id;
            this.name = n;
            this.major = m;
            this.group = g;
        }//condtructor
        //getter and setter methohs
        //id


        public void setId(String id){
            this.id = id;
        }//setID
        public  String getId(){
            return this.id;
        }//getID


        public  void  setName(String name){
            this.name = name;
        }//setname
        public  String getName(){
            return  this.name;
        }//getname


        public  void setMajor(String major){
            this.major = major;
        }//setmajor
        public  String getMajor(){
            return this.major;
        }//getmajor


        public void setGroup(String group){
                this.group = group;
        }//setgroup
        public String getGroup(){
            return  this.group;
        }//getgorup


}//class
