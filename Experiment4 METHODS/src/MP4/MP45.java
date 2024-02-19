package MP4;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 * @author Gabriel
 */
public class MP45 {

 public static void main(String[] args) {

        double gallonOfPaint;     
        double hoursOfLabor;    
        double costOfPaint;       
        double laborCharges;      
        double totalCostofJob;    

        gallonOfPaint = getGallons();
        hoursOfLabor = getLabor(gallonOfPaint);
        costOfPaint = getCostOfPaint(gallonOfPaint);
        laborCharges = getLaborCharges(hoursOfLabor);
        totalCostofJob = calculateTotalCost( laborCharges,costOfPaint); 
        displayResults(laborCharges,costOfPaint,totalCostofJob, gallonOfPaint,  hoursOfLabor);
        System.exit(0);
    }
    public static double getGallons() {
        double squFt = 118; 
        String input; 
        double numOfRooms; 
        String input2;  
        double wallSpace; 
        double sumWall = 0.0; 
        double gallonNeeded; 
        input = JOptionPane.showInputDialog("Enter the number of rooms to be painted .");
        numOfRooms = Double.parseDouble(input);
        for (int i = 1; i <= numOfRooms; i++) 
        {
            input2 = JOptionPane.showInputDialog("Enter the wall space for room number " + i);
            wallSpace = Double.parseDouble(input2);
            sumWall += wallSpace;
        }
        gallonNeeded = (sumWall / squFt);
        return gallonNeeded;
    }
    public static double getLabor(double gallonsNeeded) {
        double laborHours = (gallonsNeeded * 8);
        return laborHours;
    }
    public static double getCostOfPaint(double gallonsNeeded) {
        String input;
        double paintPrice;
        input = JOptionPane.showInputDialog("Enter price per gallon of paint .");
        paintPrice = Double.parseDouble(input);
        double spentOnPaint = gallonsNeeded * paintPrice;
        return spentOnPaint;
    }
    public static double getLaborCharges(double laborHours) {

        double money = ( (laborHours * 150) );
        return money;
    }
   public static double  calculateTotalCost(double money, double spentOnPaint){
        double totalAmount = (money + spentOnPaint);
       return totalAmount;}
  
    public static void displayResults(double laborCharges,double costOfPaint,
        double totalCostofJob, double  gallonOfPaint ,double   hoursOfLabor)
    {
        DecimalFormat formatter = new DecimalFormat( "P0.00");
         DecimalFormat notMoney = new DecimalFormat( "#0.0");
        
         JOptionPane.showMessageDialog(null,"Gallons needed :" 
                 + notMoney.format(gallonOfPaint) +  "\n" + 
                 "Labor hours needed : " + notMoney.format(hoursOfLabor) + "\n"
                 + "Cost of paint : " 
                 + formatter.format(costOfPaint) + "\n" + "Cost of labor :" 
                 + formatter.format(laborCharges) + "\n" 
                        + "Total cost of job :"
                 + formatter.format(totalCostofJob));
   }    
}
