package find_simple_interest;

import java.util.Scanner;

/**
 * @author Shubham Kumar
 */
class Simple_Interest{
    float p,r,t;
    Simple_Interest(float p,float r,float t){
        this.p=p;
        this.r=r;
        this.t=t;
    }
    public void find_Interest(){
        System.out.println("\n\nYour Principal is :- "+p+"\nYour Rate is :- "+r+"\nYour Time is :- "+t);
        System.out.println("\nYour Final Amount is :- "+((p*r*t)/100)+"\n\n");
    }
}
public class Find_Simple_Interest {
    public static void main(String[] args) {
        System.out.print("Enter your Principal :- ");
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        System.out.print("Enter your Rate :- ");
        float r=sc.nextFloat();
        System.out.print("Enter your Time in the terms of year's:- ");
        float t=sc.nextFloat();
        new Simple_Interest(p,r,t).find_Interest();
    }  
}
