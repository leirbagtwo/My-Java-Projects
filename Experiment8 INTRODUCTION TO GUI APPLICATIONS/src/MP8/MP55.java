package MP8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author Gabriel
 */

public class MP55 extends JFrame{
       
        private final JLabel messageLabel1;
        private final JLabel messageLabel2;
        private final JLabel messageLabel3;
        private final JLabel messageLabel4;
        private final JTextField pricead;
        private final JTextField numad;
        private final JTextField pricekd;
        private final JTextField numkd;
        private final JButton confirm;
        private final int WINDOW_WIDTH = 1100;
        private final int WINDOW_HEIGHT = 100;
 
    public MP55(){
            setTitle("Movie Theather Calculator");
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pricead = new JTextField(10);
            numad = new JTextField(10);
            pricekd = new JTextField(10);
            numkd = new JTextField(10);
            messageLabel1 = new JLabel("Price per adult ticket ");
            messageLabel2 = new JLabel("Number of adult tickets sold");
            messageLabel3 = new JLabel("Price per child ticket");
            messageLabel4 = new JLabel("Number of child tickets sold");
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();
            confirm = new JButton("Enter");
            confirm.addActionListener(new ButtonListener());
            setLayout(new GridLayout(1,5));
            panel1.add(messageLabel1);
            panel2.add(messageLabel2);
            panel3.add(messageLabel3);
            panel4.add(messageLabel4);
            panel1.add(pricead);
            panel2.add(numad);
            panel3.add(pricekd);
            panel4.add(numkd);
            panel5.add(confirm);
            add(panel1);
            add(panel2);
            add(panel3);
            add(panel4);
            add(panel5);
            setVisible(true);
            }
 
        private class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){ 
                String tf1,tf2,tf3,tf4;
                double grossad, netad, grosschd, netchd, totalgross, totalnet; 
                tf1 = pricead.getText();
                tf2 = numad.getText();
                tf3 = pricekd.getText();
                tf4 = numkd.getText();
                grossad = Double.parseDouble(tf1) * Double.parseDouble(tf2); 
                netad = grossad * 0.15; 
                grosschd = Double.parseDouble(tf3) * Double.parseDouble(tf4); 
                netchd = grosschd * 0.15; 
                totalgross = grossad + grosschd; 
                totalnet = netad + netchd; 
                JOptionPane.showMessageDialog(null,"The total Gross revenue for adult tickets is: " + grossad
                + "\nThe total net revenue for adult tickets is: " + netad
                + "\nThe total Gross revenue for child tickets is: " + grosschd
                + "\nThe total net revenue for child tickets is: " + netchd
                + "\nThe total Gross revenue tickets is: " + totalgross
                + "\nThe total net revenue for tickets is: " + totalnet);
            }
         }
        public static void main(String[] args){
            new MP55();
        }
}
