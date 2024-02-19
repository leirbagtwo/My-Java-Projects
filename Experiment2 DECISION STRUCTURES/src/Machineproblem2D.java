import java.util.Scanner;
/**
 * @author Gabriel
 */
public class Machineproblem2D {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
 
        final double Package=888;
        final double discount1=.20,discount2=.30,discount3=.40,discount4=.50,discount5=.0;
        double quantity,ADiscount,Discounted_Purchase,Amount_Purchase;
       
        System.out.print("Enter the number of package: ");
        quantity = keyboard.nextInt();
        
        if (quantity >= 10 && quantity <=19 ){
            
            Amount_Purchase = quantity * Package;
            ADiscount = Amount_Purchase * discount1;
            Discounted_Purchase =  Amount_Purchase - ADiscount;
            System.out.println("Your Discount is 20%");
            System.out.println("The Amount of Discount is: $"+ADiscount);
            System.out.println("Total Amount of Purchase after Discount is added: $"+Discounted_Purchase);
        }
        else if (quantity >= 20 && quantity <=49 ){
            
            Amount_Purchase = quantity * Package;
            ADiscount = Amount_Purchase * discount2;
            Discounted_Purchase =  Amount_Purchase - ADiscount;
            System.out.println("Your Discount is 30%");
            System.out.println("The Amount of Discount is: $"+ADiscount);
            System.out.println("Total Amount of Purchase after Discount is added: $"+Discounted_Purchase);
        }
        else if (quantity >= 50 && quantity <=99 ){
            
            Amount_Purchase = quantity * Package;
            ADiscount = Amount_Purchase * discount3;
            Discounted_Purchase =  Amount_Purchase - ADiscount;
            System.out.println("Your Discount is 40%");
            System.out.println("The Amount of Discount is: $"+ADiscount);
            System.out.println("Total Amount of Purchase after Discount is added: $"+Discounted_Purchase);
        }
         else if (quantity >=100){
            
            Amount_Purchase = quantity * Package;
            ADiscount = Amount_Purchase * discount4;
            Discounted_Purchase =  Amount_Purchase - ADiscount;
            System.out.println("Your Discount is 50%");
            System.out.println("The Amount of Discount is: $"+ADiscount);
            System.out.println("Total Amount of Purchase after Discount is added: $"+Discounted_Purchase);
        }
         else if (quantity >=0 && quantity <=9){
            Amount_Purchase = quantity * Package;
            ADiscount = Amount_Purchase * discount5;
            Discounted_Purchase =  Amount_Purchase - ADiscount;
            System.out.println("No discount added");
            System.out.println("The Amount of Discount is: $"+ADiscount);
            System.out.println("Total Amount of Purchase after Discount is added: $"+Discounted_Purchase);
         }
         else{
            System.out.println ("Invalid number");
         }   
     }
}


