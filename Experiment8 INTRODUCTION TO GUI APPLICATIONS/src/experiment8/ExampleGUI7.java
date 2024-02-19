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
import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for FlowLayout class
public class ExampleGUI7 extends JFrame
{
    private final int WINDOW_WIDTH = 200;  // Window width
    private final int WINDOW_HEIGHT = 105; // Window height
    /**
       Constructor
    */
    public ExampleGUI7()
    {
        setTitle("Flow Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        add(button1);
        add(button2);
        add(button3);
        setVisible(true);
    }
    /**
    * @param args
    */
    public static void main(String[] args)
    {
        ExampleGUI7 ex = new ExampleGUI7();
    }
 }
