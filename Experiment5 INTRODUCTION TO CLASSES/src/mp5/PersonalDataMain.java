package mp5;
/**
 *
 * @author Gabriel
 */
public class PersonalDataMain {
     public static void main(String[] args){
    PersonalData person1 = new PersonalData("Scarlett Johansson", "\tNew York\t", 36 , "\t928181234");
    PersonalData person2 = new PersonalData("Jennifer Lawrence", "\tKentucky\t", 31, "\t992984321");
    PersonalData person3 = new PersonalData("Emma Watson", "\t\tParis\t\t", 31, "\t992984321");
    System.out.println("Name\t\t\tAddress\t\tAge\tPhone Number");
    System.out.println(person1);
    System.out.println("\nFriends Information");
    System.out.println(person2);
    System.out.println(person3);
   }
}
