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
import javax.swing.*;    // Needed for Swing classes
 import java.awt.*;       // Needed for Color class
 import java.awt.event.*; // Needed for event listener interface
 public class ExampleGUI4 extends JFrame
 {
    private final JLabel messageLabel;
    private final JButton redButton;  
    private final JButton blueButton;    
    private final JButton yellowButton; 
    private final JPanel panel;         
    private final int WINDOW_WIDTH = 200; 
    private final int WINDOW_HEIGHT = 125;
    /**
       Constructor
    */
    public ExampleGUI4()
    {
       setTitle("Colors");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       messageLabel = new JLabel("Click a button to select a color.");
       redButton = new JButton("Red");
       blueButton = new JButton("Blue");
       yellowButton = new JButton("Yellow");
       redButton.addActionListener(new RedButtonListener());
       blueButton.addActionListener(new BlueButtonListener());
       yellowButton.addActionListener(new YellowButtonListener());
       panel = new JPanel();
       panel.add(messageLabel);
       panel.add(redButton);
       panel.add(blueButton);
       panel.add(yellowButton);
       add(panel);
       setVisible(true);
    }
    private class RedButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setBackground(Color.RED);
            messageLabel.setForeground(Color.BLUE);
        }
    }
    private class BlueButtonListener implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
       {
            panel.setBackground(Color.BLUE);
            messageLabel.setForeground(Color.YELLOW);
       }
    }
    private class YellowButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setBackground(Color.YELLOW);
            messageLabel.setForeground(Color.BLACK);
        }
    }
    public static void main(String[] args)
    {
        ExampleGUI4 ex = new ExampleGUI4();
    }
 }
