/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment6;
import java.util.ArrayList; // Needed for ArrayList class
/**
 *
 * @author Gabriel
 */
public class example222 {
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
        // Now insert an item at index 1.
        nameList.add(1, "Ruth");
        System.out.println("Ruth was added at index 1. Here are the items now.");
        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
           System.out.println("Index: " + index + " Name: " + nameList.get(index));
    }

}
