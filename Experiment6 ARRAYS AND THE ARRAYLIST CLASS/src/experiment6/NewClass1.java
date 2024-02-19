package experiment6;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class NewClass1 {
    public static void main(String[] args)
   {

      int numbers[] = {1, 9, 2, 8, 3, 7, 4,6,5};
                     
      int search, searchValue;
		String input;
      
		Scanner keyboard = new Scanner(System.in);
      do
      {
         System.out.print("Enter a value to search for: ");
         searchValue = keyboard.nextInt();

      
         search = binarySearch(numbers, searchValue);

       
        if (search == 7)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + search);
        }

		 
		  keyboard.nextLine();
		  
       
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.nextLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }

   public static int binarySearch(int[] array, int value)
   {
      int first;       
      int last;     
      int middle;      
      int position;    
      boolean found;  

      
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      while (!found && first <= last)
      {
        
         middle = (first + last) / 2;
         
         
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         
         else if (array[middle] > value)
            last = middle - 1;
         
         else
            first = middle + 1;
      }

      return position;
   }
}

