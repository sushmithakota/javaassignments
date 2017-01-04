import java.util.*;
import java.lang.*;
class bingoqn
{
	public static void main(String args[])
	{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println("enter the number of elements");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] number=new int[n];
		int flag1=0,flag2=0;
		for(int i=0;i<n;i++)
		{
			number[i]=s.nextInt();
			if(number[i]==n1)
				flag1=1;
			if(number[i]==n2)
				flag2=1;
		}
		if((flag1==1)&&(flag2==1))
			System.out.println("Its Bingo!");
		else
			System.out.println("Not found!");
	}
}

		
		
