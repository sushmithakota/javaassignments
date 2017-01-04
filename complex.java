class complex
{
	private float realpart,complexpart;
	complex()
	{
		realpart=1;
		complexpart=1;
	}
	complex(float rp,float cp)
	{
		realpart=rp;
		complexpart=cp;
	}
	complex c3=new complex();
	public void addition(complex c1,complex c2)
	{
		float sumreal=c1.realpart+c2.realpart;
		float sumcomplex=c1.complexpart+c2.complexpart;
		System.out.println(sumreal+"i+"+sumcomplex);
	}
	public void addition(complex c1,complex c2)
	{
		float subreal=c1.realpart-c2.realpart;
		float subcomplex=c1.complexpart-c2.complexpart;
		System.out.println(subreal+"i+"+subcomplex);
	}


