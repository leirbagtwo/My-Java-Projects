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
public class Experiment394 {
    public static void main(String[] args) throws IOException
    {
        String filename;           // Filename
        String friendName;         // Friend's name
        int numFriends;            // Number of friends
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();
        File file = new File(filename);
        if (file.exists())
        {
           System.out.println("The file " + filename + " already exists.");
           System.exit(0);
        }
        PrintWriter outputFile = new PrintWriter(file);
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
