/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3a;

/**
 *
 * @author Gabriel
 */
public class Experiment38 {
        public static void main(String[] args)
    {
        for (int hours = 1; hours <= 12; hours++)
        {
            for (int minutes = 0; minutes <= 59; minutes++)
            {
                for (int seconds = 0; seconds <= 59; seconds++)
                {
                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                }
            }
        }
    }

}
