package anudip_practice_question;
/**
 * @author Shubham Kumar
 */
// Task to display the first 20 even natural numbers
class EvenNumbersTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - First 20 even natural numbers:");
        for (int i = 1; i <= 20; i++) {
            System.out.print((i * 2) + " ");
        }
        System.out.println();
    }
}

// Task to display the squares of the first 20 odd natural numbers
class OddSquaresTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Squares of first 20 odd natural numbers:");
        for (int i = 1; i <= 20; i++) {
            int oddNumber = (i * 2) - 1;
            System.out.print((oddNumber * oddNumber) + " ");
        }
        System.out.println();
    }
}

// Task to display the cubes of the first 20 even natural numbers
class EvenCubesTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Cubes of first 20 even natural numbers:");
        for (int i = 1; i <= 20; i++) {
            int evenNumber = i * 2;
            System.out.print((evenNumber * evenNumber * evenNumber) + " ");
        }
        System.out.println();
    }
}

// Task to display the first 20 multiples of 10
class MultiplesOfTenTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - First 20 multiples of 10:");
        for (int i = 1; i <= 20; i++) {
            System.out.print((i * 10) + " ");
        }
        System.out.println();
    }
}
public class Anudip_Practice_Question {
    public static void main(String[] args) {
        // Creating thread for displaying first 20 even natural numbers
        Thread evenNumbersThread = new Thread(new EvenNumbersTask(), "EvenNumbersThread");

        // Creating thread for displaying squares of first 20 odd natural numbers
        Thread oddSquaresThread = new Thread(new OddSquaresTask(), "OddSquaresThread");

        // Creating thread for displaying cubes of first 20 even natural numbers
        Thread evenCubesThread = new Thread(new EvenCubesTask(), "EvenCubesThread");

        // Creating thread for displaying first 20 multiples of 10
        Thread multiplesOfTenThread = new Thread(new MultiplesOfTenTask(), "MultiplesOfTenThread");

        // Starting all threads
        evenNumbersThread.start();
        oddSquaresThread.start();
        evenCubesThread.start();
        multiplesOfTenThread.start();
    }  
}
