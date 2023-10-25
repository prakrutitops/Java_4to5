import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class TitleIconEx 
{
	
	
	public TitleIconEx() 
	{
		// TODO Auto-generated constructor stub
		Frame f=new Frame();     
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\photos\\view.png");    
		
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(400,400);     
		f.setVisible(true);     
		
	}
	
	public static void main(String[] args)
	{
		new TitleIconEx();
	}
}
