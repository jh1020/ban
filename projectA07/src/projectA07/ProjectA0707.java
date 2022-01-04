package projectA07;

import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.english = english;
		this.science = science;
		
	}
	public int average() {
		return ((this.math + this.english + this.science) / 3);
	}
}

public class ProjectA0707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		sc.close();

	}

}
