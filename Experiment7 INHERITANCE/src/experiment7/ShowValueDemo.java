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
public class ShowValueDemo {
    public static void main(String[] args) {
        // Create a SubClass3 object.
        SubClass3 myObject = new SubClass3();
        myObject.showValue(10);          // Pass an int.
        myObject.showValue(1.2);         // Pass a double.
        myObject.showValue("Hello");     // Pass a String.
    }
}
