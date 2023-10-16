import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx extends WindowAdapter
{
	JFrame frame;
	
	public OptionPaneEx() 
	{
	
		frame = new JFrame();
		
		
		//JOptionPane.showMessageDialog(frame,"Hello From Tops");
		
//		String name = JOptionPane.showInputDialog(frame,"Enter Your name");
//		System.out.println(name);
		
		frame.addWindowListener(this);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new OptionPaneEx();
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		int a= JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
	
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		/*
		 * if(a==JOptionPane.NO_OPTION) {
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } if(a==JOptionPane.CA
		 * ) { frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }
		 */
		
	}
}
