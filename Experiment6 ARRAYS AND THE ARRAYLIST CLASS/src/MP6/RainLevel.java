package MP6;
import java.util.Scanner;
/**
 * @author Gabriel
 */
public class RainLevel {
        Scanner in = new Scanner(System.in);
        private final int month = 12;
        private final double months[ ];
        public RainLevel() {
           months = new double[ 12 ]; 
        }
         public void setMonths() {
            for (int n = 0; n < month; n++) {
             System.out.print("Enter rainfall for month "+(n+1)+" :");
             months[ n ] = in.nextInt();
             if(months[ n ]<0) {
                 System.out.println("Please enter positive value.");
                 n--;
                 }
            }
        }
        public double getTotal() {
            double total = 0;
            for (int i = 0; i < month; i++) {
                 total = total + months[ i ];
            }
            return total;
        }
        public double getAverage() {
            return getTotal() / month;
        }
        public int getLargest() {
            double largest = months[ 0 ];
            int m=0;
            for (int i = 0; i < month; i++) {
                 if (months[ i ] > largest) {
                     m=i;
                 }
            }
            return m+1;
      }
      public int getSmallest() {
        double smallest = months[ 0 ];
        int m=0;
        for (int i = 0; i < month; i++) {
             if (months[ i ] < smallest)
                 m=i;
        }
        return m+1;
     }
}
