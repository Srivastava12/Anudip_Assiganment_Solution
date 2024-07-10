
import java.util.Scanner;

/**
 *
 * @author Shubham Kumar
 */
class SubArray{
    public void setArray(){
       int []arr=new int[10];
       int []arr1=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Integer Values of Array :-");
       for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
       }
       int index=0;
       int value=arr1[2];
       for(int i=2;i<=6;i++){
           arr1[index]=arr[i];
           ++index;   
           if(value<arr[i])
               value=arr[i];
       }
       System.out.print("Sub Array :");
       for(int i:arr1){
           System.out.print(" "+i);
       }
       System.out.println("\n2nd Highest element : "+value);
    }
}
public class Array {
    public static void main(String[] args) {
        new SubArray().setArray();
    } 
}
