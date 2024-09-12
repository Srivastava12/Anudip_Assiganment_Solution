package anudip_day_7_question2;

import java.util.Stack;
/**
 * @author Shubham Kumar
 */
public class Anudip_Day_7_Question2 {
    public static void main(String[] args) {
         // Create a stack of integers
        Stack<Integer> stack = new Stack<Integer>();
        
        // Add 10 elements to the stack using push() method
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        
        // Display the stack after adding elements
        System.out.println("Stack after adding 10 elements: " + stack);
        
        // Remove 4 elements from the stack using pop() method
        for (int i = 0; i < 4; i++) {
            stack.pop(); // pop removes the top element from the stack
        }
        
        // Display the stack after removing 4 elements
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}
