import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx 
{
	JFrame frame;
	JList<String>list;
	
	public ListEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		DefaultListModel<String> list1 = new DefaultListModel<>();
		
		list1.addElement("Item 1");
		list1.addElement("Item 2");
		list1.addElement("Item 3");
		list1.addElement("Item 4");
		
		
		
		list = new JList<>(list1);
		list.setBounds(100,100, 75,75);
	
		frame.add(list);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ListEx();
	}
}
