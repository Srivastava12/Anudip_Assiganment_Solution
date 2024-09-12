package anudip_day6_question3;

import java.util.ArrayList;

/**
 * @author Shubham Kumar
 */
public class Anudip_Day6_Question3 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add integers to the ArrayList
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        // Calculate the sum of all even numbers
        int sumOfEvens = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {  // Check if the number is even
                sumOfEvens += number;
            }
        }

        // Display the result
        System.out.println("The sum of all even numbers in the ArrayList is: " + sumOfEvens);
    }
}
