package mp5;
import java.util.Random;
/**
 * @author Gabriel
 */
public final class Coin {
    private String sideUp;

    public Coin() {
       
        toss();
    }

    public void toss() {
     Random rand = new Random();
     int value = rand.nextInt(2);
     if (value == 0) {
            this.sideUp = "heads";
        } else {
            this.sideUp = "tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}

