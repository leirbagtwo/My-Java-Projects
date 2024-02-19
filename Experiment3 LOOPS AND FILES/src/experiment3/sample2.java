/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

/**
 *
 * @author Gabriel
 */
public class sample2 {
    public static void main(String[] args) {
    System.out.println("Hello from the main method.");
        for (int i = 0; i < 5; i++)
           displayMessage();
        System.out.println("Back in the main method.");
    }
    /**
    The displayMessage method displays a greeting.
    */
    public static void displayMessage() {
        System.out.println("Hello from the displayMessage method.");

    }
}
