package functions;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car();
		car1.colour= "REd";
		car1.capacity= 6;
		car1.feature();

		Car car2= new Car();
		car2.colour= "white";
		car2.capacity= 5;
		car2.feature();

		Car car3= new Car();
		car3.colour= "Black";
		car3.capacity= 7;
		car3.feature();
	
		Car car4= new Car("Silver",5);
	car4.feature();
	}

}
