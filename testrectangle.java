import java.util.*;
public class testrectangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);		
		rectangle r=new rectangle();
		int length,breadth;
		r.area();
		r.perimeter();
		rectangle r1=new rectangle(10,20);
		r1.area();
		r1.perimeter();
		r.setlength(2);
		r.setbreadth(3);
		r.area();
		rectangle[] r2=new rectangle[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the length");
			length=s.nextInt();
			System.out.println("enter the breadth");
			breadth=s.nextInt();
			r2[i]=new rectangle(length,breadth);
			r2[i].area();
			r2[i].perimeter();				
		}
	}
}
