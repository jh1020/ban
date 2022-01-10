package ProjectA0902;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class ProjectA0906 {
	
	static void print(Person p) {
		if(p instanceof Person) {
			System.out.print("Preson ");
		}
		if(p instanceof Student) {
			System.out.print("Student ");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) {
			System.out.print("Professor");
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		System.out.println("new Student() ->\t");
		print(new Student());
		
		System.out.println("new Researcher() ->\t");
		print(new Researcher());
		
		System.out.println("new Profrssor() ->\t");
		print(new Professor());
	}

}
