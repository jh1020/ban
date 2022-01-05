package ProjectA08;

class People {
	public int age;
	public String name;
	public boolean isMarried;
	public int children;
	
	public void peopleinfo() {
		System.out.println("나이" + this.age);
		System.out.println("이름" + this.name);
		System.out.println("결혼 여부" + this.isMarried);
		System.out.println("자녀 수" + this.children);
	}
}

public class ProjectA0807 {
	public static void main(String[] args) {
		People peopleJames = new People();
		peopleJames.age = 40;
		peopleJames.name = "James";
		peopleJames.isMarried = true;
		peopleJames.children = 3;
		
		peopleJames.peopleinfo();
		
		
		
		
		
	}
}
