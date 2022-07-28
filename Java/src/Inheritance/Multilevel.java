package Inheritance;
class Car
{
	void driving()
	
	{ 
		System.out.println("am drving");
	}
}

class Bike extends Car
{
	void ride()
	{
		System.out.println(" am riding bike");
	}
}

class Cycle extends Bike
{
	void run()
	{
		System.out.println("am cycling");
	}
}


public class Multilevel {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.driving();
		b.ride();
		
		Cycle c = new Cycle();
		c.driving();
		c.ride();
		c.run();
}
}



