package find_time;

import java.util.Scanner;

/**
 * @author Shubham Kumar
 */
class Time{
    float d,s;
    Time(float d,float s){
        this.d=d;
        this.s=s;
    }
    public void find_Time(){
        System.out.println("\nIf Distance = "+d+" and speed = "+s+"then time will be :- "+(d/s)+"\n\n");
    }
}
public class Find_Time {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Speed :- ");
       float s=sc.nextFloat();
       System.out.println("Enter Distance :- ");
       float d=sc.nextFloat();
       new Time(d,s).find_Time();
    }
}
