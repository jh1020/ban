package ProjectA08;

public class ProjectA0802 {
	static void myStaticMethod() {
		System.out.println("myStiticMethod");
	}
	public void myPublicMethod() {
		System.out.println("myPublicMethod");
	}
	
	public static void main(String[] args) {
		myStaticMethod();
		
		ProjectA0802 myObj = new ProjectA0802();
		myObj.myPublicMethod();

	}

}
