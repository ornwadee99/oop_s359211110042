package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
//      StringTokenizer
        String msg = "Welcome to RMYUSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            StringBuffer myBuff = new StringBuffer(myToken.nextToken());
            System.out.println(myBuff.reverse()+" ");

        }


    }//mian
}//class
