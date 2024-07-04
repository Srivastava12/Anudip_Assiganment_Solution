package find_the_maximum_between_two_numbers;

import java.util.Scanner;

/**
 * @author Shubham Kumar
 */
class MaxMin{
    int a,b;
    MaxMin(){
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :- ");
        a=sc.nextInt();
        System.out.println("Enter a number again :- ");
        b=sc.nextInt();
    }
    public void find_MaxMin(){
        System.out.println("Greater number is :- "+((a>b)?a:b));
    }
}
public class Find_the_maximum_between_two_numbers {

    public static void main(String[] args) {
        new MaxMin().find_MaxMin();
    }    
}
