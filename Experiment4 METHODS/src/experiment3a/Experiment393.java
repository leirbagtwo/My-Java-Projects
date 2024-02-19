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
public class Experiment393 {
    public static void main(String[] args) throws IOException
    {
        double sum = 0.0;
        File file = new File("Numbers.txt");
        if (!file.exists())
        {
           System.out.println("The file Numbers.txt is not found.");
           System.exit(0);
        }
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
           double number = inputFile.nextDouble();
           sum = sum + number;
        }
        inputFile.close();
        System.out.println("The sum of the numbers in Numbers.txt is " + sum);
    }

}
    