class car
{
	float speed;
	int noofgears;
	public void drive(float s,int g)
	{
		speed=s;
		noofgears=g;
	}
	public void display()
	{
		System.out.prntln("Speed of the car"+speed);
		System.out.println("number of gears"+noofgears);
	}
}



