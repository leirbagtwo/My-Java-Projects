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
public class ExampleGUI11 extends JFrame
{
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 200;
    /**
       Constructor
    */
    public ExampleGUI11()
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
        JLabel label1 = new JLabel("This is cell 1.");
        JLabel label2 = new JLabel("This is cell 2.");
        JLabel label3 = new JLabel("This is cell 3.");
        JLabel label4 = new JLabel("This is cell 4.");
        JLabel label5 = new JLabel("This is cell 5.");
        JLabel label6 = new JLabel("This is cell 6.");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        panel6.add(label6);
        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        panel6.add(button6);
        add(panel1);
        add(panel2); 
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6); 
        setVisible(true);
    }
    public static void main(String[] args)
    {
        ExampleGUI11 ex = new ExampleGUI11();
    }
 }
