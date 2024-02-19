package MP74;
/**
 * @author Gabriel
 */
public class PersonDemo {
    
    public static void main(String[] args) {
       Customer myCustomer = new Customer
       ("Mark Zuckerberg", "PNew York, United States", "118-7B", "198437", true);
       System.out.print("\nCustomer");
       System.out.println("\nName: " + myCustomer.getName());
       System.out.println("Address: " + myCustomer.getAddress());
       System.out.println("Telephone: " + myCustomer.getPhone());
       System.out.println("Customer Number: " + myCustomer.getCustomerNumber());
       
 
       PreferredCustomer myPCustomer = new PreferredCustomer
       ("Gabriel F. Daniot", "Caloocan", "8-7000", "545687", true, 2000.00);
       System.out.print("\nPreferred Customer");
       System.out.println("\nName: " + myPCustomer.getName());
       System.out.println("Address: " + myPCustomer.getAddress());
       System.out.println("Telephone: " + myPCustomer.getPhone());
       System.out.println("Customer Number: " + myPCustomer.getCustomerNumber());
         if (myPCustomer.getMailingList())
       System.out.println("Mailing List: YES");
         else
       System.out.println("Mailing List: NO");
       System.out.println("Purchases: ₱ " + myPCustomer.getPurchases());
       System.out.println("Discount level: " + myPCustomer.getDiscountLevel());
    } 
} 


