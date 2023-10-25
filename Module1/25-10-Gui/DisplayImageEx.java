import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;

public class DisplayImageEx extends Canvas
{
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		//super.paint(g);
		  Toolkit t=Toolkit.getDefaultToolkit();  
	      Image i=t.getImage("E:\\photos\\view.png");  
	      g.drawImage(i, 120,100,this);  
		
	}
	
	public static void main(String[] args) 
	{
		DisplayImageEx m=new DisplayImageEx();  
	 	JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
	}
}
