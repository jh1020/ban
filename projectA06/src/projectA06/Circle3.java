package projectA06;

public class Circle3 {
	
	int radius;
	String name;
	
	public Circle3(int radius) {
		this.radius = radius;
		
	}
	
	public Circle3(String name) {
		this(100);
		this.name = name;
	}
	
	public void set(int radius) {
		this.radius = radius;
		
	}
	
	public Circle3() {
		this("피자");
	}
	
	public Circle3(String name, int radius) {
		this("피자");
		this.radius = radius;
	}
	

	public static void main(String[] args) {
		Circle3 ob1 = new Circle3(1);
		Circle3 ob2 = new Circle3(2);
		Circle3 ob3 = new Circle3(3);
		
		System.out.println(ob1.radius);
		System.out.println(ob2.radius);
		System.out.println(ob3.radius);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
		
		System.out.println(ob1.radius);
		System.out.println(ob2.radius);
		System.out.println(ob3.radius);
		
		
	}

}
