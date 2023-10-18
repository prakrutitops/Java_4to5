
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckboxEx1 implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton btn;
	
	public CheckboxEx1() 
	{
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		//Checkbox -> Multiple Item Selection
		
		chk1 = new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(121, 90, 197, 23);
		
		chk2 = new JCheckBox("Burger @ Rs. 70");
		chk2.setBounds(121, 120, 197, 23);
		
		chk3 = new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(121, 150, 197, 23);
		
		btn = new JButton("Order");
		btn.setBounds(121, 200, 89, 23);
		
		btn.addActionListener(this);
		
		// add daTA IN FRAME
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == btn)
		{
			StringBuffer buffer = new StringBuffer();
			int amount = 0;
			
			if(chk1.isSelected())
			{
				buffer.append("\n Selected Item is Pizza - 100");
				amount+=100;
				
			}
			if(chk2.isSelected())
			{
				buffer.append("\n Selected Item is Burger - 70");
				amount+=70;
				
			}
			if(chk3.isSelected())
			{
				buffer.append("\n Selected Item is Coffee - 120");
				amount+=120;
			}
			
			JOptionPane.showMessageDialog(frame,buffer.toString()+"\n Total : "+amount);
			
			
		}
	}
}
