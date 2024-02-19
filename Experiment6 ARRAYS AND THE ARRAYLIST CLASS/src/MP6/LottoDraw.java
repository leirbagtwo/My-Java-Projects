package MP6;
import java.util.Random;
/**
 * @author Gabriel
 */
public class LottoDraw {
     private final int lotteryNumbers[];
     public LottoDraw() {
        Random rand = new Random(System.currentTimeMillis());
        lotteryNumbers = new int[5];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = rand.nextInt(10);
        }
    }
    public int compareNumbers(int[] usersNumbers) {
     int match = 0;
     if (usersNumbers.length == lotteryNumbers.length) {
         for (int i = 0; i < lotteryNumbers.length; i++) {
             for(int j = 0; j < lotteryNumbers.length; i++) {
                 if (usersNumbers[i] == lotteryNumbers[j]) {
                     match++;
                     break;
                 }
             }
         }
     }
     return match;
 }
    public int[] getLotteryNumbers() {
        return lotteryNumbers;
    }
}

