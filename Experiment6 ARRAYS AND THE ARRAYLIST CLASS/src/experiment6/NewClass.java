
package experiment6;
import java.util.Scanner; 
/**
 *
 * @author Gabriel
 */
public class NewClass {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         int [][] numbers ={{1,2,3,4},
                            {5,6,7},
                            {9,10,11,12}}  ;
         int total=0;
         
         for (int row = 0; row < numbers.length; row++)
        {
            for (int col = 0; col<numbers[row].length;col++)
            
            total += numbers[row][col];   
        }
          System.out.println("The total is "+total);
    }
}
