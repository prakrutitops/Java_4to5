import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuEx implements ActionListener
{
	JFrame frame;
	JMenuBar menubar;
	JMenu File,Edit,Help;
	JMenuItem cut,copy,paste,selectall;
	JTextArea ta;
	
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		menubar = new JMenuBar();
		
		File = new JMenu("File");
		Edit = new JMenu("Edit");
		Help = new JMenu("Help");
		
		cut =new JMenuItem("Cut");
		copy =new JMenuItem("Copy");
		paste =new JMenuItem("Paste");
		selectall =new JMenuItem("Select All");
		
		ta = new JTextArea();
		ta.setBounds(109, 93, 280, 151);
		
		
		menubar.add(File);
		menubar.add(Edit);
		menubar.add(Help);
		
		Edit.add(cut);
		Edit.add(copy);
		Edit.add(paste);
		Edit.add(selectall);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		
		//frame.add(menubar);
		frame.setJMenuBar(menubar);
		frame.add(ta);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new MenuEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectall)
		{
			ta.selectAll();
		}
	}
}
