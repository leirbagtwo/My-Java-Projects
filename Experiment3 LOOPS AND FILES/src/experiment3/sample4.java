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
public class sample4 {
    public static void main(String[] args) {
        System.out.println("I am starting in main.");
        deep();
        System.out.println("Now I am back in main.");
    }
    /**
    The deep method displays a message and then calls the deeper method.
    */
    public static void deep() {
        System.out.println("I am now in deep.");
        deeper();
        System.out.println("Now I am back in deep.");
    }
    /**
    The deeper method simply displays a message.
    */
    public static void deeper() {
        System.out.println("I am now in deeper.");
    }

}
