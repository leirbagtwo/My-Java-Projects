/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

/**
 *
 * @author Gabriel
 */
public class sample10 {
    public static void main(String[] args) {
        String customerName;
        customerName = fullName("John", "Martin");
        System.out.println(customerName);
    }
    /**
    The fullName method accepts two String arguments
    containing a first and last name. It concatenates
    them into a single String object.
    @param first The first name.
    @param last The last name.
    @return A reference to a String object containing
    the first and last names.
    */
    public static String fullName(String first, String last) {
        String name;
        name = first + " " + last;
        return name;
    }

}
