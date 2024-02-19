package experiment3a;
import java.io.*;  
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class MP3B {
    public static void main(String[] args) throws IOException 
    {
        Scanner keyboard = new Scanner (System.in);
        
        String upperCase ;
        String fileToConvert;
        
        System.out.print(" Enter the Filename : ");
        String filename1 =keyboard.nextLine();
        

        System.out.print(" Enter the Filename : ");
        String filename2 =keyboard.nextLine();

        File file2 = new File (filename2);
        if (file2.exists())
        { System.out.println( " The file " + filename2 + " already exist. ");
        System.exit(0);
        }

        File file = new File (filename1 );
        Scanner inputFile = new Scanner (file);
        PrintWriter outputFile = new PrintWriter(filename2);
        
        fileToConvert =inputFile.nextLine();
        upperCase =fileToConvert.toUpperCase();
         
         while (inputFile.hasNext())
        {
            fileToConvert =inputFile.nextLine();

            upperCase =fileToConvert.toUpperCase();
            outputFile.println(upperCase); 
            System.out.println(upperCase);
        }
             System.out.println("Contents Have Been Converted to uppercase");
             inputFile.close();
             outputFile.close(); 
    }
}
