package ProjectA13;

public class ProjectA1210 {
	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
