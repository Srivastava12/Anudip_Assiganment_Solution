package anudip_day_7_question1;
import java.util.HashSet;
/**
 * @author Shubham Kumar
 */
public class Anudip_Day_7_Question1 {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> set = new HashSet<String>();
        
        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Display the HashSet before appending
        System.out.println("HashSet before appending: " + set);
        
        // Append a new element to the HashSet
        // Since a HashSet does not maintain insertion order, the position of the new element is not guaranteed
        set.add("Dragonfruit");

        // Display the HashSet after appending
        System.out.println("HashSet after appending: " + set);
    }  
}
