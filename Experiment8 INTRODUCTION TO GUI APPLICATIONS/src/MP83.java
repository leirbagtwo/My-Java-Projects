import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author Gabriel
 */
public class MP83 extends JFrame{
        private final JLabel messageLabel;
        private final JTextField propertyValue;
        private final JButton confirm;
        private final int WINDOW_WIDTH = 300;
        private final int WINDOW_HEIGHT = 100;
 public MP83(){
            setTitle("Property tax rate");
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            messageLabel = new JLabel("Enter the total Property Value");
            propertyValue = new JTextField(10);
            JPanel panel1 = new JPanel();
            confirm = new JButton("Enter");
            confirm.addActionListener(new ButtonListener());
            setLayout(new FlowLayout());
            add(messageLabel);
            panel1.add(propertyValue);
            add(panel1);
            add(confirm);
            setVisible(true);
         }
        private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){ 
            String input;
            double astvalue, prtax; 
            input = propertyValue.getText();
            astvalue = Double.parseDouble(input) * 0.15;
            prtax = (astvalue/100) * 0.35;
            JOptionPane.showMessageDialog(null,"The total Assesment Value is at: " + 
            astvalue+"\nThe total Property Tax is at: " + prtax);
        } 
       }
    public static void main(String[] args){
     new MP83();
    }
}

