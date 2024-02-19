/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment6;

/**
 *
 * @author Gabriel
 */
public class example7 {
    public static void main(String[] args) {
        int[] array1 = { 2, 4, 6, 8, 10 };
        int[] array2 = array1;
        // Change one of the elements using array1.
        array1[0] = 200;
        // Change one of the elements using array2.
        array2[4] = 1000;
        // Display all the elements using array1
        System.out.println("The contents of array1:");
        for (int value : array1)
           System.out.print(value + " ");
        System.out.println();
        // Display all the elements using array2
        System.out.println("The contents of array2:");
        for (int value : array2)
           System.out.print(value + " ");
        System.out.println();

    }

}
