package projectA07;

class Data {
	int x;
}

public class ProjectA0705 {
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data d) {
		d.x = 10000;
		System.out.println("change() Data : x = " + d.x);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() x = " + d.x);
		
	}
}
