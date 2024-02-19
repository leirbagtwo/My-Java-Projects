/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment2a;

/**
 *
 * @author Gabriel
 */
public class Experiment2I {
        public static void main(String[] args)
    	{
        String name1 = "Mary",
        name2 = "Mark";

        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " is less than " + name2);
        }
        else if (name1.compareTo(name2) == 0) {
            System.out.println(name1 + " is equal to " + name2);
        }
        else if (name1.compareTo(name2) > 0) {
            System.out.println(name1 + " is greater than " + name2);
        }
    }

}
