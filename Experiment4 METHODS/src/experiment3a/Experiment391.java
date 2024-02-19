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
public class Experiment391 {
        public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        String line = inputFile.nextLine();
        System.out.println("The first line in the file is:");
        System.out.println(line);
        inputFile.close();
    }

}
