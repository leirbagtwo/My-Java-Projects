/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment2a;
import java.util.Scanner; 
/**
 *
 * @author Gabriel
 */
public class Experiment2B {
    public static void main(String[] args) {
        double number1, number2;
        double quotient;         

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number1 = keyboard.nextDouble();

        System.out.print("Enter another number: ");
        number2 = keyboard.nextDouble();
        if (number2 == 0) {
            System.out.println("Division by zero is not possible.");
           System.out.println("Please run the program again and ");
            System.out.println("enter a number other than zero.");
        }
        else {
            quotient = number1 / number2;
            System.out.print("The quotient of " + number1);
            System.out.print(" divided by " + number2);
            System.out.println(" is " + quotient);

        }   
    }
}
