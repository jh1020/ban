package projectA06;

public class Circle2 {
	
	int radius;
	String name;
	
	public Circle2() {
		radius = 1;
		name = "";
	}
	
	public Circle2(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		
		Circle2 pizza = new Circle2(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle2 donut = new Circle2(10, "자바도넛"
				);
		
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
		
		Circle2 donut2 = new Circle2();
		
		
		donut2.name = "도넛츠";
		donut2.radius = 5;
		area = donut2.getArea();
		System.out.println(donut2.name+"의 면적은 "+area);
		
	}

}
