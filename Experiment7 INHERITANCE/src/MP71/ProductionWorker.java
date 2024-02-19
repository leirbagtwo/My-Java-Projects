package MP71;
/**
 * @author Gabriel
 */
public class ProductionWorker extends Employee {
  private int shift;
  private double hourlyPayRate;

  public ProductionWorker(String name, String number, 
          String hireDate, int shift, double payRate) {
    super(name, number, hireDate);
    this.shift = shift;
    this.hourlyPayRate = payRate;
  }
  public ProductionWorker(ProductionWorker pw) {
    super(pw.getName(), pw.getNumber(), pw.getHireDate());
    this.shift = pw.getShift();
    this.hourlyPayRate = pw.getPayRate();
  }
  public int getShift() {
    return shift;
  }
  public void setShift(int newShift) {
    this.shift = newShift;
  }
  public double getPayRate() {
    return hourlyPayRate;
  }
  public void setPayRate(double newPayRate) {
    this.hourlyPayRate = newPayRate;
  }
  @Override
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Shift: " + shift +
           "\nEmployee Hourly Pay Rate: ₱ " + hourlyPayRate;
    return str;
  }
}
