package MP8;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;
/**
 * @author Gabriel
 */
public class MP82 extends JFrame {
    private final JLabel messageLabel;
    private final JTextField totalSale;
    private final JButton confirm;
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100; 
 public MP82(){
                setTitle("Retail Company");
                setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                messageLabel = new JLabel("Enter the total sale for the month");
                totalSale = new JTextField(10);
                JPanel panel1 = new JPanel();
                confirm = new JButton("Enter");
                confirm.addActionListener(new ButtonListener());
                setLayout(new FlowLayout());
                add(messageLabel);
                panel1.add(totalSale);
                add(panel1);
                add(confirm);
                setVisible(true);
        }
        private class ButtonListener implements ActionListener{
            @Override
        public void actionPerformed(ActionEvent e){
            final double saletax = 0.07, valuetax = 0.05;
             String input;
             double totalsaletax, totalvaluetax, total; 
             input = totalSale.getText();
             totalsaletax = Double.parseDouble(input) * saletax;
             totalvaluetax = Double.parseDouble(input) * valuetax;
             total = totalsaletax + totalvaluetax;
             JOptionPane.showMessageDialog(null,"The total sales tax is: " + totalsaletax+
                     "\nThe total value added tax is: " + totalvaluetax+
                     "\nThe total tax overall is: " + total);
             }
             }
             public static void main(String[] args){
            new MP82();
   }
}


