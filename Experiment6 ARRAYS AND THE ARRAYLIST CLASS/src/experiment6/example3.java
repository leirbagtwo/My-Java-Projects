package experiment6;
/**
@author Gabriel
 */
public class example3 {
    public static void main(String[] args) {
        int[] values = new int[3];
        System.out.println("I will attempt to store four numbers in a three-element array.");
        for (int index = 0; index < 4; index++) {
           System.out.println("Now prsocessing element " + index);
           values[index] = 10;
        }
    }
}
