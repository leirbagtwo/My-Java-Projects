import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Gabriel
 */
public class MP84 extends JFrame{
        private final JLabel messageLabel;
        private final JLabel messageLabel1;
        private final JLabel messageLabel2;
        private final JLabel messageLabel3;
        private final JLabel messageLabel4;
        private final JLabel messageLabel5;
        private final JLabel messageLabel6;
        private final JLabel messageLabel7;
        private final JLabel messageLabel8;
        private final JTextField days;
        private final JTextField airfair;
        private final JTextField carfees;
        private final JTextField nummiles;
        private final JTextField parking;
        private final JTextField taxi;
        private final JTextField seminar;
        private final JTextField lodge;
        private final JButton confirm;
        private final int WINDOW_WIDTH = 500;
        private final int WINDOW_HEIGHT = 350;
     public MP84(){
            setTitle("Business trip");
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            messageLabel = new JLabel("Business Travel Expenses Calculator");
            days = new JTextField(10);
            airfair = new JTextField(10);
            carfees = new JTextField(10);
            nummiles = new JTextField(10);
            parking = new JTextField(10);
            taxi = new JTextField(10);
            seminar = new JTextField(10);
            lodge = new JTextField(10);
            messageLabel1 = new JLabel("Number of days on your trip ");
            messageLabel2 = new JLabel("Amount of air fair, if any");
            messageLabel3 = new JLabel("Amount of car rental fees, if any");
            messageLabel4 = new JLabel("Number of miles driven, if a private vehicle was used");
            messageLabel5 = new JLabel("Amount of parking fees, if any");
            messageLabel6 = new JLabel("Amount of taxi charges, if any");
            messageLabel7 = new JLabel("Conference or seminar registration fees, if any");
            messageLabel8 = new JLabel("Lodging charges, per night");
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();
            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            confirm = new JButton("Enter");
            confirm.addActionListener(new ButtonListener());
            setLayout(new FlowLayout());
            panel1.add(messageLabel1);
            panel2.add(messageLabel2);
            panel3.add(messageLabel3);
            panel4.add(messageLabel4);
            panel5.add(messageLabel5);
            panel6.add(messageLabel6);
            panel7.add(messageLabel7);
            panel8.add(messageLabel8);
            panel1.add(days);
            panel2.add(airfair);
            panel3.add(carfees);
            panel4.add(nummiles);
            panel5.add(parking);
            panel6.add(taxi);
            panel7.add(seminar);
            panel8.add(lodge);
            add(messageLabel);
            add(panel1);
            add(panel2);
            add(panel3);
            add(panel4);
            add(panel5);
            add(panel6);
            add(panel7);
            add(panel8);
            add(confirm);
            setVisible(true);
            }
   private class ButtonListener implements ActionListener
    {
    @Override
   public void actionPerformed(ActionEvent e){ 
                String tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
                double totalexpense, totalallowedex; 
                tf1 = days.getText();
                tf2 = airfair.getText();
                tf3 = carfees.getText();
                tf4 = nummiles.getText();
                tf5 = parking.getText();
                tf6 = taxi.getText();
                tf7 = seminar.getText();
                tf8 = lodge.getText();
                totalexpense = (Double.parseDouble(tf2) 
                + (Double.parseDouble(tf3) * Double.parseDouble(tf4)) 
                + Double.parseDouble(tf5) + Double.parseDouble(tf6) 
                + Double.parseDouble(tf7) + (Double.parseDouble(tf8) * 
               Double.parseDouble(tf1)));
                totalallowedex = (Double.parseDouble(tf1) * 3350) + (Double.parseDouble(tf4) * 15.25);

                JOptionPane.showMessageDialog(null,"The total expense by the business person is: " + 
               totalexpense+"\nThe total business trip budget is: " + totalallowedex);
                if(totalexpense > totalallowedex){
                double total= totalexpense - totalallowedex;
                JOptionPane.showMessageDialog(null,"the business person budget spent to much!!" + 
               "\nThe business person will pay for: " + total);
                }
                else if(totalexpense < totalallowedex){
                double total= totalallowedex - totalexpense;
                JOptionPane.showMessageDialog(null,"the business person saved some budget!!" + 
               "\nThe business person saved: " + total);
            }
          }
        }
        public static void main(String[] args)
        {
           new MP84();
        }
}
