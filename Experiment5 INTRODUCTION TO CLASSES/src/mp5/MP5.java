package mp5;
/**
 * @author Gabriel
 */
public class MP5 {
    public static void main(String[] args) {
    Employee first = new Employee("Jon Snow\t\t", 54321, "\t\t\tNight Watch", "\t\tLord");
    Employee second = new Employee("Daenaerys Targaryen\t", 65432, "\t\t\tTargaryen", "\t\tQueen");
    Employee third = new Employee("Arya Stark\t\t", 76543, "\t\t\tHouse of Black", "\t\tFaceless Man");
    System.out.println("Name\t\t\tID Number\t\tDepartment\t\tPosition");
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    }
}
 