/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment7;

/**
 *
 * @author Gabriel
 */
public class SubClass3 extends SuperClass3 {
    /**
        This method overrides one of the superclass methods.
        @param arg An int.
    */
    @Override
    public void showValue(int arg) {
        System.out.println("SUBCLASS:  The int argument was " + arg);
    }
    /**
        This method overloads the superclass methods.
        @param arg A double.
    */
    public void showValue(double arg) {
        System.out.println("SUBCLASS: The double argument was " + arg);
    }
}
