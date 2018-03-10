package JavaSession6Assignment;

public class Car extends Vehicle{
	String name;
	Car(String nm){
		//super(nm.length());
		name = nm;
		System.out.println("The car name is "+name);
	}
	
	Car(int s){
		super(s);
		//speedLimit=speedLimit;
		System.out.println("The speed limit for car is "+speedLimit);
	}
	
	public Car() {
		super(7);
	}
	
	
	public void handSteering(){
		System.out.println("The car has hand steering.");
	}
	public void wheel(int w){
		int wheel=4;
		System.out.println("The general car has "+wheel+" wheel");
	}

}
