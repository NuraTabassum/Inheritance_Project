package JavaSession6Assignment;

public class Hatchback extends Car{ 
	Hatchback(String nm){
	super(nm);
}

public void move()
{
	
	System.out.println("The hatchback moves");
	super.move();
	
}
@Override
public void wheel(int w){
	//super.wheel(w);
	int wheel=2;
	System.out.println("The hatchback car has "+w+" wheel");
}
}



