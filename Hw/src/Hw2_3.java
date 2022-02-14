import java.util.Scanner;

public class Hw2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나머지와 몫을 구하는 프로그램입니다.");
		System.out.print("첫번째 정수를 입력하세요: ");
		int fnum = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요: ");
		int snum = sc.nextInt();
		
		System.out.println("몫: "+(fnum/snum)+ " 나머지: "
				+ (fnum%snum));
	}
}
