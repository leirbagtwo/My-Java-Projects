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
import java.awt.*;    // Needed for GridLayout class
public class ExampleGUI10 extends JFrame
{
    private final int WINDOW_WIDTH = 400; 
    private final int WINDOW_HEIGHT = 200;
    /**
       Constructor
    */
    public ExampleGUI10()
    {
        setTitle("Grid Layout");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        add(button1);  // Goes into row 1, column 1
        add(button2);  // Goes into row 1, column 2
        add(button3);  // Goes into row 1, column 3
        add(button4);  // Goes into row 2, column 1
        add(button5);  // Goes into row 2, column 2
        add(button6);  // Goes into row 2, column 3
        setVisible(true);
    }
    public static void main(String[] args)
    {
        ExampleGUI10 ex = new ExampleGUI10();
    }
 }

