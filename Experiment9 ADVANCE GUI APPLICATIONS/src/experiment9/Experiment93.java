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
public class Experiment93 extends JFrame
{
    private JPanel monthPanel;    
    private JPanel selectedMonthPanel;   
    private JPanel buttonPanel;         
    private JList monthList;             
    private JList selectedMonthList;     
    private JScrollPane scrollPane1;     
    private JScrollPane scrollPane2;     
    private JButton button;             
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public Experiment93()
    {
        setTitle("List Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        buildMonthPanel();
        buildSelectedMonthsPanel();
        buildButtonPanel();
        add(monthPanel, BorderLayout.NORTH);
        add(selectedMonthPanel,BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
    private void buildMonthPanel()
    {
        monthPanel = new JPanel();
        monthList = new JList(months);
        monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        monthList.setVisibleRowCount(6);
        scrollPane1 = new JScrollPane(monthList);
        monthPanel.add(scrollPane1);
    }
    private void buildSelectedMonthsPanel()
    {
        selectedMonthPanel = new JPanel();
        selectedMonthList = new JList();
        selectedMonthList.setVisibleRowCount(6);
        scrollPane2 = new JScrollPane(selectedMonthList);
        selectedMonthPanel.add(scrollPane2);
    }
    private void buildButtonPanel()
    {
        buttonPanel = new JPanel();
        button = new JButton("Get Selections");
        button.addActionListener(new ButtonListener());
        buttonPanel.add(button);
    }
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object[] selections = monthList.getSelectedValuesList().toArray();
            selectedMonthList.setListData(selections);
        }
    }

    public static void main(String[] args)
    {
        Experiment93 ex = new Experiment93();
    }
 }
