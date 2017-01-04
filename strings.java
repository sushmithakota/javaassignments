class strings
{
	public  static void main(String args[])
	{
		int len=args[0].length();
		System.out.println("the string lenght:"+len);
		String str=args[0];
		System.out.println(str.toUpperCase());
		str.toLowerCase();
		String str1=new StringBuffer(str).reverse().toString();
		if(str.compareTo(str1)==0)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
