import java.util.*;
class strtoken
{
	private String name,date_of_birth;
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		name=s.nextLine();
		System.out.println("enter the date of birth in format dd/mm/yyyy");
		date_of_birth=s.nextLine();
	}
	public void display()
	{
		System.out.println("name is:"+name);
		StringTokenizer st=new StringTokenizer(date_of_birth,"/");
		System.out.print("Date of birth is:");
		while (st.hasMoreTokens())  
			System.out.print(st.nextToken("/")+" ");
	}
	public static void main(String[] args)
	{
		srttoken st=new srttoken();
		st.input();
		st.display();
	}
}
