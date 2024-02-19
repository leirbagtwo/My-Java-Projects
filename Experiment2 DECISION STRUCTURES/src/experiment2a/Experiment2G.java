/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment2a;
import javax.swing.JOptionPane; 
/**
 *
 * @author Gabriel
 */
public class Experiment2G {
    public static void main(String[] args)
    {
        double salary;       
        double yearsOnJob;    
        String input;      

        input = JOptionPane.showInputDialog("Enter your annual salary.");
        salary = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter the number of years at your current job.");
        yearsOnJob = Double.parseDouble(input);
        
        if (salary >= 30000 || yearsOnJob >= 2) {
            JOptionPane.showMessageDialog(null, "You qualify for the loan.");
        }
        else {
            JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");
        }
        System.exit(0);
    }
}
