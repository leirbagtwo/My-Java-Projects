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
public class DataOfSales {
        private double[] sales; // The sales data
    /**
        The constructor copies the elements in
        an array to the sales array.
        @param s The array to copy.
    */
    public DataOfSales(double[] s) {
        // Create an array as large as s.
        sales = new double[s.length];
        // Copy the elements from s to sales.
        for (int index = 0; index < s.length; index++)
            sales[index] = s[index];
    }
    /**
        getTotal method
        @return The total of the elements in the sales array.
    */
    public double getTotal() {
        double total = 0.0;      // Accumulator
        // Accumulate the sum of the elements
        // in the sales array.
        for (int index = 0; index < sales.length; index++)
            total += sales[index];
        // Return the total.
        return total;
    }
    /**
        getAverage method
        @return The average of the elements in the sales array.
    */
    public double getAverage() {
        return getTotal() / sales.length;
    }
    /**
        getHighest method
        @return The highest value stored in the sales array.
    */
    public double getHighest() {
        double highest = sales[0];
        for (int index = 1; index < sales.length; index++) {
            if (sales[index] > highest)
                highest = sales[index];
        }   
        return highest;
    }
    /**
        getLowest method
        @return The lowest value stored in the sales array.
    */
    public double getLowest() {
        double lowest = sales[0];
        for (int index = 1; index < sales.length; index++) {
            if (sales[index] < lowest)
                lowest = sales[index];
        }
        return lowest;
    }

}
