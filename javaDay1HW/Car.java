package javaDay1HW;

public class Car {

	public static void main(String[] args) {

		Car objCar=new Car();
		objCar.driveCar();
		objCar.applyBrake();
		objCar.soundHorn();
		objCar.isPuncture();
	}
		
public void driveCar()
{
	System.out.println("My car is automatic and it is Easy to drive");
}
public void applyBrake()
{
	System.out.println("Applying brake is easy in automatic cars");
}
public void soundHorn()
{
	System.out.println("Sound of Horn in car is very high");
}
public void isPuncture()
{
	System.out.println("Car Punture");
}
}
