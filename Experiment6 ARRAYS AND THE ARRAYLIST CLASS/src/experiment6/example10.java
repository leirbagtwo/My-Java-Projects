/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment6;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
public class example10 {
        public static void main(String[] args) {
        final int ONE_WEEK = 7; // Number of elements
        double[] sales = new double[ONE_WEEK]; // Create an array to hold sales amounts for a week.
        // Get the week's sales figures.
        getValues(sales);
        // Create a SalesData object, initialized with the week's sales figures.
        DataOfSales week = new DataOfSales(sales);
        // Display the total, average, highest, and lowest sales amounts for the week.
        JOptionPane.showMessageDialog(null,String.format("The total sales were $%,.2f\n" + "The average sales were $%,.2f\n" + "The highest sales were $%,.2f\n" + "The lowest sales were $%,.2f", week.getTotal(),
            week.getAverage(),
            week.getHighest(),
            week.getLowest())
        );
        System.exit(0);
    }
    /**
        The getValues method asks the user to enter sales
        amounts for each element of an array.
        @param array The array to store the values in.
    */
    private static void getValues(double[] array) {
        String input;  // To hold user input.
        // Get sales for each day of the week.
        for (int i = 0; i < array.length; i++) {
            input = JOptionPane.showInputDialog( "Enter the sales for day " + (i + 1) + ".");
            array[i] = Double.parseDouble(input);
        }
    }

}
