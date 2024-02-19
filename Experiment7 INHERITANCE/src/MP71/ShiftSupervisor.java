package MP71;
/**
 * @author Gabriel
 */
public class ShiftSupervisor extends Employee {
  private double annualSalary;
  private double annualBonus;
  
  public ShiftSupervisor(String name, String number, 
          String hireDate, double salary, double bonus) {
    super(name, number, hireDate);
    this.annualSalary = salary;
    this.annualBonus = bonus;
  }
  public ShiftSupervisor(ShiftSupervisor ss) {
    super(ss.getName(), ss.getNumber(), ss.getHireDate());
    this.annualSalary  = ss.getAnnualSalary();
    this.annualBonus = ss.getAnnualBonus();
  }
  public double getAnnualSalary() {
    return annualSalary;
  }
  public void setAnnualSalary(double newSalary) {
    this.annualSalary = newSalary;
  }
  public double getAnnualBonus() {
    return annualBonus;
  }
  public void setAnnualBonus(double newBonus) {
    this.annualBonus = newBonus;
  }
  @Override
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Annual Salary: ₱ " + annualSalary +
           "\nEmployee Annual Bonus: ₱ " + annualBonus;
    return str;
  }
}
