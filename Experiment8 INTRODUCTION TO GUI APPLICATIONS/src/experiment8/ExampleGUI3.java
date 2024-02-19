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

import javax.swing.*;       // Needed for Swing classes
import java.awt.event.*;    // Needed for ActionListener Interface
public class ExampleGUI3 extends JFrame
{
    private JPanel panel;          
    private JLabel messageLabel;    
    private JTextField kiloTextField;
    private JButton calcButton;    
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100;
    /**
       Constructor
    */
    public ExampleGUI3()
    {
       setTitle("Kilometer Converter");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       buildPanel();
       add(panel);
       setVisible(true);
    }
    private void buildPanel()
    {
        messageLabel = new JLabel("Enter a distance in kilometers: ");
        kiloTextField = new JTextField(10);
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(new CalcButtonListener());
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
    private class CalcButtonListener implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
       {
          final double CONVERSION = 0.6214;
          String input;  // To hold the user's input
          double miles;  // The number of miles
          // Get the text entered by the user into the text field.
          input = kiloTextField.getText();
          // Convert the input to miles.
          miles = Double.parseDouble(input) * CONVERSION;
          // Display the result.
          JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");
       }
    }
    /**
       main method
     * @param args
    */
    public static void main(String[] args)
    {
        ExampleGUI3 ex = new ExampleGUI3();
    }
}
