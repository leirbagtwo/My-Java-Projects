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
public class Experiment2C {
        public static void main(String[] args)
    {
      double salary;        
      double yearsOnJob;    
      String input; 
      input = JOptionPane.showInputDialog("Enter your annual salary.");
      salary = Double.parseDouble(input);
      input = JOptionPane.showInputDialog("Enter the number of years at your current job.");
      yearsOnJob = Double.parseDouble(input);
      if (salary >= 30000) {
        if (yearsOnJob >= 2) {
          JOptionPane.showMessageDialog(null, "You qualify for the loan.");
        }
        else {
          JOptionPane.showMessageDialog(null, "You must have been on your current job for at least two years to qualify.");
        }
      }
      else {
        JOptionPane.showMessageDialog(null, "You must earn at least $30,000 per year to qualify.");
      }
    System.exit(0);
    }

}
