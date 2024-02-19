/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3a;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Experiment395 {
    public static void main(String[] args)
    {
        int number1;        // A number
        int number2;        // Another number
        int sum;            // The sum of the numbers
        int userAnswer;     // The user's answer
        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        number1 = randomNumbers.nextInt(100);
        number2 = randomNumbers.nextInt(100);
        System.out.println("What is the answer to the following problem?");
        System.out.print(number1 + " + " + number2 + " = ? ");
        sum = number1 + number2;
        userAnswer = keyboard.nextInt();
        if (userAnswer == sum)
            System.out.println("Correct!");
        else
            System.out.println("Sorry, wrong answer. The correct answer is " + sum);
    }

}
