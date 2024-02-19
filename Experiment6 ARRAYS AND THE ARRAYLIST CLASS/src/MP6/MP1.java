package MP6;
/**
 * @author Gabriel
 */
public class MP1 {
     public static void main(String[ ] args) {
        RainLevel rl = new RainLevel();
        rl.setMonths();
        System.out.println("PAGASA WEATHER FORECAST");
        System.out.println("The total rainfall for the year: " + rl.getTotal());
        System.out.println("The average rainfall for the year: " + rl.getAverage());
        System.out.println("The month with most rain: " + rl.getLargest());
        System.out.println("The month with least rain: " + rl.getSmallest());
     }
}
