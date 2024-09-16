package anudip_day8_question1;
/***
 * @author Shubham Kumar
 */
import java.util.HashMap;

public class Anudip_Day8_Question1 {
    public static void main(String[] args) {
        // Create a HashMap that stores Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the HashMap using the put() method
        // put() associates the specified value with the specified key
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Print the HashMap to display the initial key-value pairs
        System.out.println("Initial HashMap: " + map);

        // Associate a new value with an existing key
        // This will replace the old value for key 2
        map.put(2, "Blueberry");

        // Print the HashMap after updating the value for key 2
        System.out.println("Updated HashMap: " + map);

        // Retrieve and print the value associated with a specific key
        int key = 1;  // Example key
        String value = map.get(key);
        System.out.println("Value associated with key " + key + ": " + value);

        // Check if a key exists in the HashMap
        if(map.containsKey(3)) {
            System.out.println("Key 3 exists in the HashMap.");
        }

        // Check if a value exists in the HashMap
        if(map.containsValue("Cherry")) {
            System.out.println("Value 'Cherry' exists in the HashMap.");
        }

        // Remove a key-value pair from the HashMap
        map.remove(3); // Removing the entry for key 3

        // Print the HashMap after removing an entry
        System.out.println("HashMap after removal: " + map);
    }
}