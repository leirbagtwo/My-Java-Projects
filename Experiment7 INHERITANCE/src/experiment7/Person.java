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
public class Person implements Displayable {
    private final String name;
    // Constructor
    public Person(String n) {
       name = n;
    }
    // display method
    @Override
    public void display() {
       System.out.println("My name is " + name);
    }
}
