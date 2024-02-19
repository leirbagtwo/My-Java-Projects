package mp5;

/**
 @author Gabriel
 */
public class CoinMain {
    static final int NUMBER_OF_TOSSES = 20;
    public static void main(String args[]) {

    Coin myCoin = new Coin();
    
    System.out.println("The side initially facing up: "+ myCoin.getSideUp());
    System.out.println("Now I will toss the coin " + NUMBER_OF_TOSSES + " times.");
    int headCount = 0;
    for (int i = 0; i < NUMBER_OF_TOSSES; i++) {
        
    myCoin.toss();
    System.out.println("Toss:   " + myCoin.getSideUp());
    if ("heads".equals(myCoin.getSideUp())) {
        headCount++;
        }
    }
    System.out.println("Heads facing up: " + headCount);
    System.out.println("Tails facing up: " + (NUMBER_OF_TOSSES - headCount));
 }
}
