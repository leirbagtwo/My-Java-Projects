/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3a;
import java.util.Scanner;
import java.io.*;              

/**
 *
 * @author Gabriel
 */
public class Experiment39 {
        public static void main(String[] args) throws IOException
    {
       String filename;      // File name
       String friendName;    // Friend's name
       int numFriends;       // Number of friends
       Scanner keyboard = new Scanner(System.in);
       System.out.print("How many friends do you have? ");
       numFriends = keyboard.nextInt();
       keyboard.nextLine();
       System.out.print("Enter the filename: ");
       filename = keyboard.nextLine();
       PrintWriter outputFile = new PrintWriter(filename);
       for (int i = 1; i <= numFriends; i++)
       {
          System.out.print("Enter the name of friend number " + i + ": ");
          friendName = keyboard.nextLine();
          outputFile.println(friendName);
       }
       outputFile.close();
       System.out.println("Data written to the file.");
    }

}
