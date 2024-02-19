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
import java.awt.event.*;

public class ExampleGUI12 extends JFrame
{
    private JPanel panel;                     // A holding panel
    private JLabel messageLabel;              // A message to the user
    private JTextField kiloTextField;         // To hold user input
    private JRadioButton milesButton;         // To convert to miles
    private JRadioButton feetButton;          // To convert to feet
    private JRadioButton inchesButton;        // To convert to inches
    private ButtonGroup radioButtonGroup;     // To group radio buttons
    private final int WINDOW_WIDTH = 400;     // Window width
    private final int WINDOW_HEIGHT = 100;    // Window height
    /**
       Constructor
    */
    public ExampleGUI12()
    {
        setTitle("Metric Converter");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    private void buildPanel()
    {
        messageLabel = new JLabel("Enter a distance in kilometers");
        kiloTextField = new JTextField(10);
        milesButton = new JRadioButton("Convert to miles");
        feetButton = new JRadioButton("Convert to feet");
        inchesButton = new JRadioButton("Convert to inches");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(milesButton);
        radioButtonGroup.add(feetButton);
        radioButtonGroup.add(inchesButton);
        milesButton.addActionListener(new RadioButtonListener());
        feetButton.addActionListener(new RadioButtonListener());
        inchesButton.addActionListener(new RadioButtonListener());
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(milesButton);
        panel.add(feetButton);
        panel.add(inchesButton);
    }
    private class RadioButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String input;          
            String convertTo = ""; 
            double result = 0.0; 
            input = kiloTextField.getText();
            if (e.getSource() == milesButton)
            {
               convertTo = " miles.";
               result = Double.parseDouble(input) * 0.6214;
            }
            else if (e.getSource() == feetButton)
            {
               convertTo = " feet.";
               result = Double.parseDouble(input) * 3281.0;
            }
            else if (e.getSource() == inchesButton)
            {
               convertTo = " inches.";
               result = Double.parseDouble(input) * 39370.0;
            }
            JOptionPane.showMessageDialog(null, input + " kilometers is " + result + convertTo);
        }
    }
    public static void main(String[] args)
    {
        ExampleGUI12 ex = new ExampleGUI12();
    }
 }
