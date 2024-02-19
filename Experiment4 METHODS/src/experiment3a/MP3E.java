package experiment3a;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Gabriel
 */
public class MP3E {
    public static void main(String []args)throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        String userFilenName;
        int linenum = 1 ;
        
        System.out.println("Enter the File name with .txt: ");
        userFilenName = scanner.nextLine();
        
         File file = new File(userFilenName);
         
         while(!file.exists()){
             System.out.println( userFilenName + " does not exist. Enter a Different filename: \n" );
             userFilenName = scanner.nextLine();
             file = new File (userFilenName);
             
         }
         Scanner fileToScan = new Scanner( file );
         
         while( fileToScan.hasNext()){
               System.out.println(linenum+ ": "+ fileToScan.nextLine());
               linenum = linenum + 1  ;
      }
   }
}
 
