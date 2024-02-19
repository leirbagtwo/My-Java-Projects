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
public class example13 {
        public static void main(String[] args) {
        String[] months = { "January", "February", "March",
                            "April", "May", "June", "July",
                            "August", "September", "October",
                            "November", "December" 
        };
        int[] days = { 31, 28, 31, 30, 31, 30, 31,
                        31, 30, 31, 30, 31 
        };
        for (int index = 0; index < months.length; index++)
            System.out.println(months[index] + " has " + days[index] + " days.");
    }

}
