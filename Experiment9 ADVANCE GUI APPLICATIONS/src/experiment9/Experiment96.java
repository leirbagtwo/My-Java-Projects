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
public class Experiment96 extends JFrame
{
    private JLabel messageLabel;           
    private final int LABEL_WIDTH = 400;     
    private final int LABEL_HEIGHT = 200;   
    private JMenuBar menuBar;               
    private JMenu fileMenu;                 
    private JMenu textMenu;                
    private JMenuItem exitItem;              
    private JRadioButtonMenuItem blackItem; 
    private JRadioButtonMenuItem redItem;    
    private JRadioButtonMenuItem blueItem;   
    private JCheckBoxMenuItem visibleItem;   

    public Experiment96()
    {
       setTitle("Example Menu System");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       messageLabel = new JLabel("Use the Text menu to change my color and make me invisible.",SwingConstants.CENTER);
       messageLabel.setPreferredSize(new Dimension(LABEL_WIDTH, LABEL_HEIGHT));
       messageLabel.setForeground(Color.BLACK);
       add(messageLabel);
       buildMenuBar();
       pack();
       setVisible(true);

    }
    private void buildMenuBar()
    {
        menuBar = new JMenuBar();
        buildFileMenu();
        buildTextMenu();
        menuBar.add(fileMenu);
        menuBar.add(textMenu);
        setJMenuBar(menuBar);
    }
    private void buildFileMenu()
    {
        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.addActionListener(new ExitListener());
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.add(exitItem);
    }
    private void buildTextMenu()
    {
        blackItem = new JRadioButtonMenuItem("Black", true);
        blackItem.setMnemonic(KeyEvent.VK_B);
        blackItem.addActionListener(new ColorListener());
        redItem = new JRadioButtonMenuItem("Red");
        redItem.setMnemonic(KeyEvent.VK_R);
        redItem.addActionListener(new ColorListener());
        blueItem = new JRadioButtonMenuItem("Blue");
        blueItem.setMnemonic(KeyEvent.VK_U);
        blueItem.addActionListener(new ColorListener());
        ButtonGroup group = new ButtonGroup();
        group.add(blackItem);
        group.add(redItem);
        group.add(blueItem);
        visibleItem = new JCheckBoxMenuItem("Visible", true);
        visibleItem.setMnemonic(KeyEvent.VK_V);
        visibleItem.addActionListener(new VisibleListener());
        textMenu = new JMenu("Text");
        textMenu.setMnemonic(KeyEvent.VK_T);
        textMenu.add(blackItem);
        textMenu.add(redItem);
        textMenu.add(blueItem);
        textMenu.addSeparator();
        textMenu.add(visibleItem);
    }
    private class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    private class ColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (blackItem.isSelected())
                messageLabel.setForeground(Color.BLACK);
            else if (redItem.isSelected())
                messageLabel.setForeground(Color.RED);
            else if (blueItem.isSelected())
                messageLabel.setForeground(Color.BLUE);
        }
    }
    private class VisibleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (visibleItem.isSelected())
                messageLabel.setVisible(true);
            else
                messageLabel.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
       Experiment96 ex = new Experiment96();
    }
 }
