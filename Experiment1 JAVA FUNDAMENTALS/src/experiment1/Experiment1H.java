package experiment1;
/**
 * @author Joan Lazaro
 */
// This is a simple Java program.
public class Experiment1H {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "Java Programming is Fun";
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(2);
        int stringSize = message.length();
        
        System.out.println(message);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        System.out.println(stringSize);

    }
}
