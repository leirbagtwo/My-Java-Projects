
package experiment6;
import java.util.ArrayList; 
/**
 *
 * @author Gabriel
 */
public class example22 {
    public static void main(String[] args)  {
        // Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();
        // Add some names to the ArrayList.
        nameList.add("Joan");
        nameList.add("Ralph");
        nameList.add("Rylle");
        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) 
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        // Now remove the item at index 0.
        nameList.remove(0);
        System.out.println("The item at index 0 is removed. Here are the items now.");
        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
           System.out.println("Index: " + index + " Name: " + nameList.get(index));
    }

}
