package functions;

public class Car {
	String colour;
	int capacity;

	public void feature()

	{
		System.out.println("Car features are Colour=" + colour + ", and capacity=" + capacity);
	}

	public Car(String colour, int capacity) // parameter constructor
	{
		this.colour= colour;
		this.capacity= capacity;

	}
public Car() // default constructor
{
	
}

}
