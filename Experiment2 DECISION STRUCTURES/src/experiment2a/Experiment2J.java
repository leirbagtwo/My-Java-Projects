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
public class Experiment2J {
    public static void main(String[] args)
    {
        String input;    
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();
        if (input.equalsIgnoreCase("SoftWareEngineering")) {
            System.out.println("Congratulations! You know the secret word!");
        }
        else {
            System.out.println("Sorry, that is NOT the secret word!");
        }
    }
}
