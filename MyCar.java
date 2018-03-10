package JavaSession6Assignment;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUV suv=new SUV("BMW");
		Hatchback h=new Hatchback("Toyota");
		Car car=new Car(80);
		//car.move();
		suv.handSteering();
		suv.gearChange();
		h.move();
		suv.wheel(6);
		h.wheel(2);
		}}
