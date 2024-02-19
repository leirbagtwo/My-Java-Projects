package MP4;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class M43 {
    
    public static double profitCal(double NS, double PP, double PC, double SP, double SC){
        
        double profit;
        profit = ((NS * SP) -SC) - ((NS * PP) + PC);
        
        return profit;
    }

    public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
        double NS,PP,PC,SP,SC;
        double profit;
        System.out.println("Enter the Number of Share (NS): " );
        NS = scanner.nextDouble();
        
        System.out.println("Enter the Purchase Price (PP): " );
        PP = scanner.nextDouble();
        
        System.out.println("Enter the Purchase Commission (PC): " );
        PC = scanner.nextDouble();
        
        System.out.println("Enter the Sale Price (SP): " );
        SP = scanner.nextDouble();
        
        System.out.println("Enter the Sale Commission (SC): " );
        SC = scanner.nextDouble();
        
        profit = profitCal(NS,PP,PC,SP,SC);
        
        if ( profit < 0){
             System.out.printf( "You made a loss of $%,.2f\n",profit );
        } else {
              System.out.printf( "You made a profit of $%,.2f\n",profit );
        }
    }
}
