/**
 * @author Shubham Kumar
 */
class UniqueC{
    public void getUniqueC(String s){
        char []arr;
        arr=s.toCharArray();
        outer :for(int i=0;i<s.length();i++){
            int check=0;
            for(int j=0;j<s.length();j++){
                if(j==i)
                    continue;
                if(arr[i]==arr[j]){
                    check=1;
                    continue outer;
                }
            }
            if(check==0)
               System.out.print(arr[i]);
        }
    }
}
public class Main1 {
    public static void main(String[] args) {
         UniqueC u=new UniqueC();
         u.getUniqueC("jajbjcj");
         System.out.println("");
    }  
}
