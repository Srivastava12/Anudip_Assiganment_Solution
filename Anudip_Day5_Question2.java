package anudip_day5_question2;
/**
 * @author Shubham Kumar
 */
public class Anudip_Day5_Question2 {
    public static void main(String[] args) {
        // Define an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop to access elements beyond the array's valid index range
        try {
            for (int i = 0; i <= numbers.length; i++) {
                // Attempt to access an element at index i
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException and print an error message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
