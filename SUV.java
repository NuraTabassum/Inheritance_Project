package JavaSession6Assignment;

public class SUV extends Car{
	SUV(String nm){
		super(nm);
		
		name=name+" SUV";
		
		System.out.println("The Suv name is "+name);
	}
	/*SUV(int s){
		super(s);
		System.out.println("The speed limit for Suv"+name+" is"+speedLimit);
	}*/
public void gearChange(){
	System.out.println("The gear change to both D and R");
	move();//Called move explicitly
}
@Override
public void wheel(int w){
	super.wheel(w);
	int wheel=6;
	System.out.println("The SUV car has "+w+" wheel");
	
}
}
