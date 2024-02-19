package MP8;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;
/**
 * @author Gabriel
 */
public class MP8_1 extends JFrame
{
   private JTextField hoursTextField;
   private JCheckBox oil;
   private JCheckBox radiator;
   private JCheckBox ATF;
   private JCheckBox inspection;
   private JCheckBox Brake;
   private JCheckBox tire;
   private JCheckBox non;
   private final int WINDOW_WIDTH = 300; 
   private final int WINDOW_HEIGHT = 70; 
   public MP8_1()
   {
		setTitle("Romy's Automotive");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout() );
		JPanel panel = new JPanel();      
		JPanel leftPanel = new JPanel();
		oil			= new JCheckBox("Oil Change");
		radiator		= new JCheckBox("Radiator flush");
		ATF                     = new JCheckBox("ATF flush");
		inspection		= new JCheckBox("Inspection");
		Brake			= new JCheckBox("Brake replacement");
		tire			= new JCheckBox("Tire rotation");
		non			= new JCheckBox("Nonroutine services");
		hoursTextField	= new JTextField(3);
		JButton button1 = new JButton("Total");	
		button1.addActionListener(new ButtonListener());
		leftPanel.add(oil);
		leftPanel.add(radiator);
		leftPanel.add(ATF);
		leftPanel.add(inspection);
		leftPanel.add(Brake);
		leftPanel.add(tire);
		leftPanel.add(non);
		leftPanel.add(hoursTextField);
		panel.add(button1);
        
		add(panel, BorderLayout.SOUTH);		
		add(leftPanel, BorderLayout.WEST);
		pack();				
		setVisible(true);	
	}
	private class ButtonListener implements ActionListener
	{
                @Override
		public void actionPerformed(ActionEvent e)
		{
			String input;			 
			double nonRoutineCost;	
			double subTotal = 0;		
			if ( oil.isSelected() )				subTotal += 3120;
			if ( radiator.isSelected() )		subTotal += 500;
			if ( ATF.isSelected() )	subTotal += 2850;
			if ( inspection.isSelected() )		subTotal += 150;
			if ( Brake.isSelected() )			subTotal += 3340;
			if ( tire.isSelected() )			subTotal += 200;    
			if ( non.isSelected() )
			{
				input = hoursTextField.getText();
				nonRoutineCost = Double.parseDouble(input) * 300;
				subTotal += nonRoutineCost;
			}
			JOptionPane.showMessageDialog(null, "Your subtotal comes to ₱" + subTotal );
		}
	}
	public static void main(String[] args)
	{
	  new MP8_1();
	}
}
