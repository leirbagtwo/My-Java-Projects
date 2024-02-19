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
import javax.swing.event.*;
import java.awt.*;
public class Experiment97 extends JFrame
{
    private JLabel label1, label2;
    private JTextField fahrenheitTemp;
    private JTextField celsiusTemp;   
    private JPanel fpanel;             
    private JPanel cpanel;            
    private JPanel sliderPanel;      
    private JSlider slider;            
    public Experiment97()
    {
        setTitle("Temperatures");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1 = new JLabel("Fahrenheit: ");
        label2 = new JLabel("Celsius: ");
        fahrenheitTemp = new JTextField("32.0", 10);
        fahrenheitTemp.setEditable(false);
        celsiusTemp = new JTextField("0.0", 10);
        celsiusTemp.setEditable(false);
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5); 
        slider.setPaintTicks(true);   
        slider.setPaintLabels(true);  
        slider.addChangeListener(new SliderListener());
        fpanel = new JPanel();
        fpanel.add(label1);
        fpanel.add(fahrenheitTemp);
        cpanel = new JPanel();
        cpanel.add(label2);
        cpanel.add(celsiusTemp);
        sliderPanel = new JPanel();
        sliderPanel.add(slider);
        setLayout(new GridLayout(3, 1));
        add(fpanel);
        add(cpanel);
        add(sliderPanel);
        pack();
        setVisible(true);
    }
    private class SliderListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent e)
        {
            double fahrenheit, celsius;
            celsius = slider.getValue();
            fahrenheit = (9.0 / 5.0) * celsius + 32.0;
            celsiusTemp.setText(Double.toString(celsius));
            fahrenheitTemp.setText(String.format("%.1f", fahrenheit));
        }
    }
    public static void main(String[] args)
    {
        Experiment97 ex = new Experiment97();
    }
 }

