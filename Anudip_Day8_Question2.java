package anudip_day8_question2;
/***
 * @author Shubham Kumar
 */
import java.util.HashMap;

public class Anudip_Day8_Question2 {
    public static void main(String[] args) {
        // Create a HashMap that stores Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Check if the HashMap is empty using isEmpty() method
        if (map.isEmpty()) {
            System.out.println("The HashMap is currently empty.");
        } else {
            System.out.println("The HashMap contains some key-value mappings.");
        }

        // Adding some key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Check again if the HashMap is empty after adding elements
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Display the contents of the HashMap
        System.out.println("HashMap contents: " + map);
    }
}
