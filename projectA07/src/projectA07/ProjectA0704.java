package projectA07;

class MyMath {
	static long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	static long subtract(long a, long b) {
		return (a - b);
	}
	
	static long multiply(long a, long b) {
		return (a * b);
	}
	
	static double divide(double a, double b) {
		return a / b;
	}
	
}

public class ProjectA0704 {
	
	
	
	public static void main(String[] args) {
		//MyMath mm = new MyMath();
		
		long result1 = MyMath.add(5L, 3L);
		long result2 = MyMath.subtract(5L, 3L);
		long result3 = MyMath.multiply(5L, 3L);
		double result4 = MyMath.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) =" + result1);
		System.out.println("subtract(5L, 3L) =" + result2);
		System.out.println("multiply(5L, 3L) =" + result3);
		System.out.println("divide(5L, 3L) =" + result4);
		
	}
}
