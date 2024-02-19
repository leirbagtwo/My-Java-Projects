package MP6;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class MP5 {
    public static void main(String[] args){ 
	int accountNumber;
	char answer; 
	String input; 
	Scanner Keyboard = new Scanner(System.in);
	do {
        System.out.print("Enter a charge account number: ");
        accountNumber = Keyboard.nextInt();
        if (isValid(accountNumber)) {
System.out.println(accountNumber + " is a valid charge account number.");
	}
	else {
System.out.println(accountNumber + " is not a valid charge account number.");
		}
	 Keyboard.nextLine();
System.out.print("Would you like to enter another charge account number (y/n)? ");
         input = Keyboard.nextLine(); 
         answer = input.charAt(0);
         } while (answer == 'y');   
	}
    public static boolean isValid(int accountNumber){  
       int[] validAccountNumber = { 5658845, 8080152, 1005231, 4520125, 4562555,
       6545231, 7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 8451277,
       7825877, 7881200, 1302850, 1250255, 4581002 };
       int results;
	   results = sequentialSearch(validAccountNumber, accountNumber);
        return results != -1;
	}
    public static int sequentialSearch(int[] array,int value){
		int index;        
		int element;      
		boolean found;   
		index = 0;
		element = -1;
		found = false;
		while (!found && index < array.length){
			if (array[index] == value){
				found = true;
				element = index;
			}
			index++;
		}
		return element;
	}
}




