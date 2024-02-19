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
public class Experiment94 extends JFrame
{
    private JPanel coffeePanel;          
    private JPanel selectedCoffeePanel;  
    private JComboBox coffeeBox;
    private JLabel label;
    private JTextField selectedCoffee;
    private String[] coffee = {"Regular Coffee", "Dark Roast", "Cappuccino", "Espresso", "Decaf"};
    public Experiment94()
    {
        setTitle("Combo Box Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildCoffeePanel();
        buildSelectedCoffeePanel();
        add(coffeePanel, BorderLayout.CENTER);
        add(selectedCoffeePanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
    private void buildCoffeePanel()
    {
        coffeePanel = new JPanel();
        coffeeBox = new JComboBox(coffee);
        coffeeBox.addActionListener(new ComboBoxListener());
        coffeePanel.add(coffeeBox);
    }
    private void buildSelectedCoffeePanel()
    {
        selectedCoffeePanel = new JPanel();
        label = new JLabel("You selected: ");
        selectedCoffee = new JTextField(10);
        selectedCoffee.setEditable(false);
        selectedCoffeePanel.add(label);
        selectedCoffeePanel.add(selectedCoffee);
    }
    private class ComboBoxListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String selection = (String) coffeeBox.getSelectedItem();
            selectedCoffee.setText(selection);
        }
    }
    public static void main(String[] args)
    {
        Experiment94 ex = new Experiment94();
    }
 }
