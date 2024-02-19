/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3a;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
public class Experiment34 {
        public static void main(String[] args)
    {
        final int MIN_PLAYERS = 9;     // Minimum players per team
        final int MAX_PLAYERS = 15;    // Maximum players per team
        int players;                   // Number of available players
        int teamSize;                  // Number of players per team
        int teams;                     // Number of teams
        int leftOver;                  // Number of leftover players
        String input;                  // To hold the user input
        input = JOptionPane.showInputDialog("Enter the number of players per team.");
        teamSize = Integer.parseInt(input);
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
        {
           input = JOptionPane.showInputDialog("The number must be at least " + MIN_PLAYERS + " and no more than " + MAX_PLAYERS + ".\n Enter the number of players.");
           teamSize = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog("Enter the available number of players.");
        players = Integer.parseInt(input);
        while (players < 0)
        {
           input = JOptionPane.showInputDialog("Enter 0 or greater.");
           players = Integer.parseInt(input);
        }
        teams = players / teamSize;
        leftOver = players % teamSize;
        JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " + leftOver + " players left over.");
        System.exit(0);
    }

}
