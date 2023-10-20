import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClickEx 
{
	
	JFrame frame;
	JButton btn1,btn2;
	JPanel jp,jp2;
	JTextField tf1,tf2;
	
	public ClickEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		btn1 =new JButton("A");
		btn2 =new JButton("B");

		tf1 =new JTextField(5);
		tf2 =new JTextField(20);
		
		jp = new JPanel();
		jp.add(tf1);
		
		jp2 = new JPanel();
		jp2.add(tf2);
		
		jp.setVisible(true);
		jp2.setVisible(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				jp2.setVisible(true);
				jp.setVisible(false);
				
			}
		});
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(jp);
		frame.add(jp2);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ClickEx();
	}
}
