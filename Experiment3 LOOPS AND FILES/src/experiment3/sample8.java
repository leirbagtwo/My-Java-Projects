
package experiment3;
/**
 *
 * @author Gabriel
 */
public class sample8 {
    public static void main(String[] args) {
        texas();
        california();
    }
    /**
    The texas method has a local variable named birds.
    */
    public static void texas() {
        int birds = 5000;
        System.out.println("In texas there are " + birds + " birds.");
    }
    /**
    The california method also has a local variable named birds.
    */
    public static void california() {
        int birds = 3500;
        System.out.println("In california there are " + birds + " birds.");
    }

}
