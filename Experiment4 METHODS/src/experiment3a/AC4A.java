package experiment3a;
import java.util.Random;
 
/**
 *
 * @author Gabriel
 */
public class AC4A {
    
    public static void main (String []args){ 
        Random random = new Random();
        int count = 0;
         System.out.println("generating random number either 0 or 1");
         
         for (int i=0; i<5;i++){
         count =  random.nextInt(2);
          
        if ( count == 0 ||  count == 1){
            System.out.println("No  : "+count);
            System.out.println("Yes : "+count);
        }
      }
    } 
  }
  



  
