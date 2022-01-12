package ProjectA12;

public class AppTest {
	
	public static void main(String[] args) {
		Person p = new Person();
		Student s = (Student)p;
		
		Student s1 = new Student();
		Person p2 = s1;
		Student s2 = (Student)p;
		
	}
}	
