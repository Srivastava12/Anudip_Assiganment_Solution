package anudip_day_6_question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shubham Kumar
 */
// Interface defining the contract for reversing a list of strings
interface ListReverser {
    List<String> reverse(List<String> list);
}

// Concrete implementation of the ListReverser interface
class StringListReverser implements ListReverser {

    // Method to reverse a list of strings
    @Override
    public List<String> reverse(List<String> list) {
        // Create a copy of the list to avoid modifying the original list
        List<String> reversedList = new ArrayList<>(list);
        // Use Collections.reverse to reverse the list
        Collections.reverse(reversedList);
        return reversedList;
    }
}
// Main class to demonstrate the functionality
public class Anudip_Day_6_Question_2 {
    public static void main(String[] args) {
        // Create an instance of the ListReverser
        ListReverser reverser = new StringListReverser();

        // Create a list of strings to reverse
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("cherry");

        // Reverse the list using the ListReverser
        List<String> reversedList = reverser.reverse(originalList);

        // Display the original and reversed lists
        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }  
}
