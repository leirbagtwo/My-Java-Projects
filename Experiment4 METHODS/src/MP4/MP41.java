package MP4;
/**
 *
 * @author Gabriel
 */
public class MP41 {
    public static void showChar( String strGiven, int intGiven){
        if  (intGiven >= 0 && intGiven <= strGiven.length() -1) {
            System.out.println( "The character at position " + intGiven +" in " + strGiven + " is " + strGiven.charAt( intGiven));
        }
        else {
            System.out.println( "Enter an  index of 0 to the last index of "+ strGiven+" which is "+(strGiven.length()-1));
        }
    }
    public static void main ( String [] args ){
      showChar( "Gabriel", 7);  //**position at 3 , 5 , 7 **//
    }
}
