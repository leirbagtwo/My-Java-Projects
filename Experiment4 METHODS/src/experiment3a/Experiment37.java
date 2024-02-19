/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3a;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class Experiment37 {
      public static void main(String[] args)
    {
        int number;      // Loop control variable
        int maxValue;    // Maximum value to display
        System.out.println("I will display a table of numbers and their squares.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How high should I go? ");
        maxValue = keyboard.nextInt();
        System.out.println("Number Number Squared");
        System.out.println("-----------------------");
        for (number = 1; number <= maxValue; number++)
        {
           System.out.println(number + "\t\t" + number * number);
        }
    }
}
