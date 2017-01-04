class rectangle
{
	private float length,breadth;
	rectangle()
	{
		length=0;
		breadth=0;
	}
	rectangle(float l,float b)
	{
		length=l;
		breadth=b;
	}
	public float getlength()
	{
		return length;
	}
	public float getbreadth()
	{
		return breadth;
	}
	public void setlength(float l)
	{
		if(l>0 && l<=20)
			length=l;
	}
	public void setbreadth(float b)
	{
		if(l>0 && l<=20)
			breadth=b;
	}
	public void area()
	{
		float area=length*breadth;
		System.out.println("area is "+area);
	}
	public void perimeter()
	{
		float perimeter= (2*length+2*breadth);
		System.out.println("perimeter is"+perimeter);
	}
}
