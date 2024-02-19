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
public class Experiment9 extends JFrame
{
    private JPanel monthPanel;           // To hold components
    private JPanel selectedMonthPanel;   // To hold components
    private JList monthList;             // The months
    private JTextField selectedMonth;    // The selected month
    private JLabel label;                // A message
    private String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    /**
       Constructor
    */
    public Experiment9()
    {
        setTitle("List Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildMonthPanel();
        buildSelectedMonthPanel();
        add(monthPanel, BorderLayout.CENTER);
        add(selectedMonthPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    private void buildMonthPanel()
    {
        monthPanel = new JPanel();
        monthList = new JList(months);
        monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        monthList.addListSelectionListener(new ListListener());
        monthPanel.add(monthList);
    }

    private void buildSelectedMonthPanel()
    {
        selectedMonthPanel = new JPanel();
        label = new JLabel("You selected: ");
        selectedMonth = new JTextField(10);
        selectedMonth.setEditable(false);
        selectedMonthPanel.add(label);
        selectedMonthPanel.add(selectedMonth);
    }

    private class ListListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            String selection = (String) monthList.getSelectedValue();
            selectedMonth.setText(selection);
        }
    }

    public static void main(String[] args)
    {
        Experiment9 ex = new Experiment9();
    }
 }
