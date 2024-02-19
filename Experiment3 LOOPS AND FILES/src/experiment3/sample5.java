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
public class sample5 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("I am passing values to displayValue.");
        displayValue(5);                                       // Pass 5
        displayValue(x);                                       // Pass 10
        displayValue(x * 4);                                   // Pass 40
        displayValue(Integer.parseInt("700"));                 // Pass 700
        System.out.println("Now I am back in main.");
    }
    /**
    The displayValue method displays the value of its integer parameter.
    */
    public static void displayValue(int num) {
        System.out.println("The value is " + num);
    }

}
