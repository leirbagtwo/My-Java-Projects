package experiment3a;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class MP3C {
    public static void main (String []args){ 
       Scanner keyboard = new Scanner(System.in);
       int Day_worked,days;
       int pennies;
       int Tpennies = 0;
       final int penniesD = 100;
       double Tsalary = 0;
       System.out.print("Every dollar has a 100 pennies\n");
       System.out.println("Enter the number of days worked: ");
       Day_worked = keyboard.nextInt();
       
       System.out.println("Days\tPennies for a day\n----\t-------------------");
       for (days =1; days <= Day_worked; days++){
           pennies = (int) Math.pow(2 , days - 1);
           System.out.println(+ days +"\t"+pennies);
           Tpennies = Tpennies + pennies;
           
       }
       Tsalary= (double) Tpennies/ penniesD;
       System.out.println("Total of the salary: $"+Tsalary);
      
    }
}
/*
 Write a program that calculates the amount a person would earn over a period of time if 
his or her salary is one penny the first day, two pennies the second day, and continues to double  
each day. The program should display a table showing the salary for each day, and then show the 
total pay at the end of the period. The output should be displayed in a dollar amount, not the number 
of pennies. Input Validation: Do not accept a number less than 1 for the number of days worked.
*/