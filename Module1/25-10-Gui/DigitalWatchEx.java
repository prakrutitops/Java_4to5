import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class DigitalWatchEx implements Runnable
{
	JFrame frame;
	Thread t=null; //declare 
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	JButton b;  
	
	
	public DigitalWatchEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		t = new Thread(this);  //initialization
	    t.start();//thread call
	    
	    
	    
	    
	    b=new JButton();  
        b.setBounds(100,100,150,50); 
		//b.setText(Calendar.getInstance().getTime().toString());
        frame.add(b);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new DigitalWatchEx();
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
		while(true)
		{
			
			Calendar cal = Calendar.getInstance();  
			
			 hours = cal.get( Calendar.HOUR_OF_DAY); 
			 
			 if ( hours > 12 ) hours -= 12;  
			 
			 minutes = cal.get(Calendar.MINUTE);
			 seconds = cal.get(Calendar.SECOND);
			 
			 
			 SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
	         Date date = cal.getTime();  
	         timeString = formatter.format(date);  
	         //printtime();
	         b.setText(timeString);
	         try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
