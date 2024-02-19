/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment8;

/**
 *
 * @author Gabriel
 */
import javax.swing.*;
public class ExampleGUI extends JFrame
{
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 250;   
    /**
       Constructor
    */
    public ExampleGUI()
    {
       setTitle("A Simple Window");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
    }
    public static void main(String[] args)
    {
       ExampleGUI em = new ExampleGUI();
    }
} 

