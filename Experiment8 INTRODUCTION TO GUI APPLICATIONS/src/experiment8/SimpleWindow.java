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
public class SimpleWindow extends JFrame
{
    /*
    Constructor
    */
    public SimpleWindow()
    {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;
        setTitle("A Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     }
  }
