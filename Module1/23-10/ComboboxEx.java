import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboboxEx 
{
	JFrame frame;
	JComboBox<String>cb;
	JButton btn;
	JLabel label;
	
	String city[]= {"Rajkot","Surat","Baroda"};
	
	public ComboboxEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		cb = new JComboBox<>(city);
		cb.setBounds(67, 55, 70, 22);
	
		btn =new JButton("Submit");
		btn.setBounds(166, 55, 89, 23);
	
		label = new JLabel();
		label.setBounds(122, 206, 245, 14);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				label.setText("Your Selected City is : "+cb.getItemAt(cb.getSelectedIndex()));
				
				
			}
		});
		
		frame.add(cb);
		frame.add(btn);
		frame.add(label);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new ComboboxEx();
	}
}
