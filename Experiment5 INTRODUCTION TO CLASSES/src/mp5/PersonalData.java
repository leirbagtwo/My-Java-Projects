package mp5;

/**
 @author Gabriel
 */
   public class PersonalData {
     private String name;
     private String address;
     private int age;
     private String phoneNumber;
  
   public PersonalData(String name, String address, int age, String phoneNumber) {
     this.name = name;
     this.address = address;
     this.age = age;
     this.phoneNumber = phoneNumber;
     }

    public String getName() {
     return name;
     }
    public void setName(String name) {
     this.name = name;
     }
    public String getAddress() {
     return address;
     }
    public void setAddress(String address) {
     this.address = address;
     }
    public int getAge() {
     return age;
     }
    public void setAge(int age) {
     this.age = age;
     }
    public String getPhoneNumber() {
     return phoneNumber;
     }
    public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;
     }
     @Override
    public String toString() {
    return String.format("%s %s %s %s", name, address, age, phoneNumber);
     } 
}
      
