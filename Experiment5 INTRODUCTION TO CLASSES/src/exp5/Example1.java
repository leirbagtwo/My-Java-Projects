/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5;

/**
 *
 * @author Gabriel
 */
public class Example1 {
        public static void main(String[] args) {
        // Create a Rectangle object.
        Rectangle box = new Rectangle();
        // Set length to 10.0 and width to 20.0.
        box.setLength(10.0);
        box.setWidth(20.0);
        // Display the length.
        System.out.println("The box's length is " + box.getLength());
        // Display the width.
        System.out.println("The box's width is " + box.getWidth());
        // Display the area.
        System.out.println("The box's area is " + box.getArea());
    }

}
