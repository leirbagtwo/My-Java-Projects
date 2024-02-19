/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment9;

/**
 *
 * @author Gabriel
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Experiment95 extends JFrame
{
    private JPanel imagePanel; 
    private JPanel buttonPanel;   
    private JLabel imageLabel;   
    private JButton button;
    public Experiment95()
    {
        setTitle("My Cat");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildImagePanel();
        buildButtonPanel();
        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
    private void buildImagePanel()
    {
        imagePanel = new JPanel();
        imageLabel = new JLabel("Click the button to see an image of my cat.");
        imagePanel.add(imageLabel);
    }

    private void buildButtonPanel()
    {
        ImageIcon smileyImage;
        buttonPanel = new JPanel();
        smileyImage = new ImageIcon("Smiley.gif");
        button = new JButton("Get Image");
        button.setIcon(smileyImage);
        button.addActionListener(new ButtonListener());
        buttonPanel.add(button);
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ImageIcon catImage = new ImageIcon("Cat.jpg");
            imageLabel.setIcon(catImage);
            imageLabel.setText(null);
            pack();
        }
    }
    public static void main(String[] args)
    {
        Experiment95 ex = new Experiment95();
    }
 }
