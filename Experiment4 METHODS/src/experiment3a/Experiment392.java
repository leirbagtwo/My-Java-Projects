/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3a;
import java.util.Scanner;
import java.io.*;              // Needed for File I/O classes

/**
 *
 * @author Gabriel
 */
public class Experiment392 {
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext())
        {
           String friendName = inputFile.nextLine();
           System.out.println(friendName);
        }
        inputFile.close();
    }
 
}
