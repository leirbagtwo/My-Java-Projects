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
public class Experiment2K {
    public static void main(String[] args)
    {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1, 2, or 3: ");
        number = keyboard.nextInt();
        switch (number)
        {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            default:
                System.out.println("That's not 1, 2, or 3!");
         }
    }

}
