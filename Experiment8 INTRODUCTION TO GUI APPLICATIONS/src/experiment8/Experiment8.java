/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment8;
import javax.swing.*;
/**
 *
 * @author Gabriel
 */
public class Experiment8 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        final int WINDOW_WIDTH = 350;   // Window width in pixels
        final int WINDOW_HEIGHT = 250;  // Window height in pixels
        // Create a window.
        JFrame window = new JFrame();
        // Set the title.
        window.setTitle("A Simple Window");
        // Set the size of the window.
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Specify what happens when the close button is clicked.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Display the window.
        window.setVisible(true);
    }
}

