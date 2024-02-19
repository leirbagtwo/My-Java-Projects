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
public class Experiment2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double score1;    // To hold score #1
        double score2;    // To hold score #2
        double score3;    // To hold score #3
        double average;   // To hold the average score
        String input;     // To hold the user's input
        input = JOptionPane.showInputDialog("Enter score #1:");
        score1 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter score #2:");
        score2 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter score #3:");
        score3 = Double.parseDouble(input);
        
        average = (score1 + score2 + score3) / 3.0;
        JOptionPane.showMessageDialog(null, "The average is " + average);

        if (average > 95)
            JOptionPane.showMessageDialog(null, "That's a great score!");
        System.exit(0);

    }
    
}
