package MP4;
import java.util.Scanner;
/**
 @author Gabriel
 */
public class M44 {
    public static void menu(){
        System.out.println( "1. Convert to kilometers." );
        System.out.println( "2. Convert to Inches." );
        System.out.println( "3. Convert to feet." );
        System.out.println( "4. Quit the program.\n" );
    }
    public static void showkm(double meters){
        double km;
        km = 0.001 * meters;
        System.out.printf( "\n%.2f converted to km is %.2f\n\n",meters,km);
    }
    public static void showIn(double meters){
        double Inches;
        Inches = 39.37 * meters;
        System.out.printf( "\n%.2f converted to Inches is %.2f\n\n",meters,Inches);
    }
    public static void showft(double meters){
        double feet;
        feet = 3.281 * meters;
        System.out.printf( "\n%.2f converted to feet is %.2f\n\n",meters,feet);
    }
    public static void main (String []args){
          Scanner scanner = new Scanner (System.in);
          double meters;
          int sentinel = 4;
          int choice;       
          System.out.println( "Enter Distance in meters: " );
          meters = scanner.nextDouble();
 
          while( meters < 0){
              System.out.println("Eneter a positive distance number: ");
              meters = scanner.nextDouble();
          }
          menu();
          System.out.println( "Enter your choice: " );
          choice = scanner.nextInt();
          
          while( choice != sentinel){
              if ( choice == 1 ){
                  showkm( meters );
              }else if (choice == 2){
                  showIn(meters);
              }else if (choice == 3){
                  showft(meters);
              }else{
                   System.out.println("Error");
              }
              menu();
              System.out.println( "Enter your choice: " );
              choice = scanner.nextInt();
          }
       System.out.println("\nThe program has reached the end of the service");
     } 
}
    
