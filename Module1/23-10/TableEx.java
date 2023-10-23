import javax.swing.*;
import javax.swing.JTable;

public class TableEx 
{
	JFrame frame;
	JTable table;
	String column[]={"ID","NAME","SALARY"};   
	 String data[][]={ {"101","Amit","670000"},    
             {"102","Jai","780000"},    
             {"101","Sachin","700000"}};    
	 JScrollPane sp;
	public TableEx() 
	{
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		
		table =new JTable(data,column);
		table.setBounds(30,40,200,300);   
		
		
		 sp=new JScrollPane(table);
		 
		 frame.add(sp);          
		 frame.setSize(300,400);    
		 frame.setVisible(true);    
		 
		 
		
		
		
		
	}
	public static void main(String[] args)
	{
		new TableEx();
	}
}
