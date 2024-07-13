
import java.util.Scanner;

/**
 *
 * @author Shubham Kumar
 */
class Stack{
    int temp=-1;
    int index=0;
    char []arr;
    int n;
    public void createStack(int n){
        this.n=n;
        arr=new char[n];
    }
    public boolean isEmpty(){
        if(temp==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(temp==n-1)
            return true;
        else
            return false;
    }
    public void push(char s){
        arr[index]=s;
        ++index;
        ++temp;
    }
    public void pop(){
        --index;
        --temp;        
    }
}
class CheckParenthesis{
    Stack st=new Stack();
     public void getParenthesis(){
         String str;
         int check=0,check2=0;
         System.out.println("Enter Your Sentence");
         str=new Scanner(System.in).nextLine();
         st.createStack(str.length());
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)=='('){
                st.push(str.charAt(i));
                if(check==0){
                     System.out.println("The position of the opening parenthesis is "+i);
                     ++check;
                }
             }
             else
             if(str.charAt(i)==')'){
                 st.pop();
                 if(st.isEmpty()){
                     System.out.println("The corresponding closing parenthesis is on "+i);
                     check2=0;
                     check=0;
                 }
                 else{
                     ++check2;
                 }
             }
         }
         if(check2!=0)
             System.out.println("Opening parenthesis and closing parenthesis is not balance");
     }
}
public class Main {
    public static void main(String[] args) {
       CheckParenthesis ck=new CheckParenthesis();
       ck.getParenthesis();
    }   
}
