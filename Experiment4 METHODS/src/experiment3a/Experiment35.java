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
public class Experiment35 {
        public static void main(String[] args)
    {
        int score1, score2, score3;      // Three test scores
        double average;                  // Average test score
        char repeat;                     // To hold 'y' or 'n'
        String input;                    // To hold input
        System.out.println("This program calculates the average of three test scores.");
        Scanner keyboard = new Scanner(System.in);
        do
        {
           System.out.print("Enter score #1: ");
           score1 = keyboard.nextInt();
           System.out.print("Enter score #2: ");
           score2 = keyboard.nextInt();
           System.out.print("Enter score #3: ");
           score3 = keyboard.nextInt();
           keyboard.nextLine();
           average = (score1 + score2 + score3) / 3.0;
           System.out.println("The average is " + average);
           System.out.println(); 
           System.out.println("Would you like to average another set of test scores?");
           System.out.print("Enter Y for yes or N for no: ");
           input = keyboard.nextLine();
           repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');
    }   

}
