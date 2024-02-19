package experiment3a;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class MP3D {
public static void main(String[] args) {

		int value; 		
		int smallest;
		int largest = 0; 								
		
		Scanner input = new Scanner(System.in);			

		System.out.println("Instructions: The computer will prompt you for a");
		System.out.println("number value each time until you enter the number" + "\'\n-99'");

		System.out.print("Enter a number: ");			
		value = input.nextInt();

		smallest = value;
		while(value != -99){							
			System.out.print("Enter a number: ");			
			value = input.nextInt();
			if(value != -99){
				if (value > smallest){
					largest = value;
				}
				else{
					smallest =value;					
				}		
			}
		}
		System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest);
	}
}
