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
public class Experiment2H {
    public static void main (String[] args)
    {
        String name1 = "Gabriel",
        name2 = "Gabriel",
        name3 = "Gab";
        if (name1.equals(name2)) {
            System.out.println(name1 + " and " + name2 + " are the same.");
        }
        else {
            System.out.println(name1 + " and " + name2 + " are NOT the same.");
        }
        if (name1.equals(name3)) {
            System.out.println(name1 + " and " + name3 + " are the same.");
        }
        else {
            System.out.println(name1 + " and " + name3 + " are NOT the same.");
        }
    }
}
