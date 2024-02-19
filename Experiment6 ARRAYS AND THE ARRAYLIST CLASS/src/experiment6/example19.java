/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment6;
import java.util.ArrayList; 
/**
 *
 * @author Gabriel
 */
public class example19 {
        public static void main(String[] args)  {
       // Create an ArrayList to hold some names.
       ArrayList<String> nameList = new ArrayList<String>();
       // Add some names to the ArrayList.
       nameList.add("Joan");
       nameList.add("Ralph");
       nameList.add("Rylle");
       // Display the size of the ArrayList.
       System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");
       // Now display the items in nameList.
       for (String name : nameList)
          System.out.println(name);
    }

}
