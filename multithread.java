import java.util.*;
public class multithread extends TimerTask
{
	static Timer t;
	static int count;
	public static void main(String[] args)
	{
		 t = new Timer();
		t.schedule(new multithread(),1,1);
	}
            public void run()
	 {
		Random rn=new Random();
		int number=rn.nextInt(100);
		System.out.println(number);
		square s=new square(number);
		cube c=new cube(number);	
		Thread t1=new Thread(s);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		count++;
		if(count>10)//indicates how many times the run method has to run
			t.cancel();
            }	
}

class square extends Thread
{
	int number;
	square(int numb)
	{
		number=numb;
	}
	public void run()
	{
		try
		{  
      			//Thread.sleep(50);  
			System.out.println("the square of the "+number+":"+(number*number));
     		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
   	}  
		
}
class cube extends Thread
{
	int number;
	cube(int numb)
	{
		number=numb;
	}
	public void run()
	{
		try
		{
			//Thread.sleep(100);
			System.out.println("the cube of the"+number+":"+(number*number*number));  
      			
     		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		
	}
}
	

