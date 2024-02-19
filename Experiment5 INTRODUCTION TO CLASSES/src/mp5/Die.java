package mp5;
import java.util.Random;
/**
 @author Gabriel
 */
public final class Die {
    private final int NUMBER_OF_SIDES = 6;
    private int value;
    
    public Die(){
     roll();
    }
    public void roll(){
        Random randomValue = new Random();
        value = randomValue.nextInt(NUMBER_OF_SIDES) + 1;
    }
    public int getValue() {
         return value;
    }
}
    
    
    
    
    
    
    
    
    
    
    
