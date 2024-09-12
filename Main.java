/**
 * @author Shubham Kumar
 */
class Palindrome{
    public void CheckPalindrome(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
            s1=s1+s.charAt(i);
        if(s1.equalsIgnoreCase(s))
        System.out.println(s+" is a Palindrome");
    }
}
public class Main {
    public static void main(String[] args) {
       Palindrome pd=new Palindrome();
       pd.CheckPalindrome("Madam");
    }
}
