package experiment1;
/**
 * @author Joan Lazaro
 */
// This is a simple Java program.
public class Experiment1B {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int checking;   // Declare an int variable named checking.
        byte miles;     // Declare a byte variable named miles.
        short minutes;  // Declare a short variable named minutes.
        long days;      // Declare a long variable named days.
        checking = -20;
        miles = 105;
        minutes = 120;
        days = 189000;
        System.out.println("We have made a journey of " + miles + " miles.");
        System.out.println("It took us " + minutes + " minutes.");
        System.out.println("Our account balance is $" + checking);
        System.out.println("About " + days + " days ago Columbus stood on this spot.");
    }
}
