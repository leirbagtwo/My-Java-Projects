package MP71;
/*
 * @author Gabriel
 */
public class TeamLeader extends ProductionWorker {
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double completedTrainingHours;

  public TeamLeader(String name, String number, String hireDate, int shift, 
          double payRate, double monthlyBonus, double rth, double cth) {
    super(name, number, hireDate, shift, payRate);
    this.monthlyBonus = monthlyBonus;
    this.requiredTrainingHours = rth;
    this.completedTrainingHours = cth;
  }
  public TeamLeader(TeamLeader tl) {
    super(tl.getName(), tl.getNumber(), tl.getHireDate(), 
            tl.getShift(), tl.getPayRate());
    this.monthlyBonus = tl.getMonthlyBonus();
    this.requiredTrainingHours = tl.getRequiredTrainingHours();
    this.completedTrainingHours = tl.getCompletedTrainingHours();
  }
  public double getMonthlyBonus() {
    return monthlyBonus;
  }
  public void setMonthlyBonus(double bonus) {
    this.monthlyBonus = bonus;
  }
  public double getRequiredTrainingHours() {
    return requiredTrainingHours;
  }
  public void setRequiredTrainingHours(double hours) {
    this.requiredTrainingHours = hours;
  }
  public double getCompletedTrainingHours() {
    return completedTrainingHours;
  }
  public void setCompletedTrainingHours(double hours) {
    this.completedTrainingHours = hours;
  }
  @Override
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Monthly Bonus: ₱ " + monthlyBonus +
           "\nEmployee Required Training Hours:  " + requiredTrainingHours +
           "\nEmployee Completed Training Hours:  " + completedTrainingHours;
    return str;
  }
}
