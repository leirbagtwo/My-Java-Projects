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
public class Experiment92 extends JFrame
{
    private JPanel monthPanel;
    private JPanel selectedMonthPanel;  
    private JList monthList;            
    private JScrollPane scrollPane;      
    private JTextField selectedMonth;    
    private JLabel label;               
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
 
    public Experiment92()
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
        monthList.setVisibleRowCount(6);
        scrollPane = new JScrollPane(monthList);
        monthPanel.add(scrollPane);
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
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            String selection = (String) monthList.getSelectedValue();
            selectedMonth.setText(selection);
        }
    }
    public static void main(String[] args)
    {
        Experiment92 ex = new Experiment92();
    }
 }
