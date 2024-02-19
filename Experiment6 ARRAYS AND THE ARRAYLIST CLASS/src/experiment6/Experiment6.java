package experiment6;
import java.util.Scanner;
/**
  @author Gabriel
 */
public class Experiment6 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;          // Number of employees
        int[] hours = new int[EMPLOYEES]; // Array of hours
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");
        // Get the hours worked by employee 1.
        System.out.print("Employee 1: ");
        hours[0] = keyboard.nextInt();
        // Get the hours worked by employee 2.
        System.out.print("Employee 2: ");
        hours[1] = keyboard.nextInt();
        // Get the hours worked by employee 3.
        System.out.print("Employee 3: ");
        hours[2] = keyboard.nextInt();
        // Display the values entered.
        System.out.println("The hours you entered are:");
        System.out.println(hours[0]);
        System.out.println(hours[1]);
        System.out.println(hours[2]);
   
    }
}



