package projectA05;

import java.util.Scanner;

public class projectA0505 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sun = 0;
		for(int i = 0;i<5;i++) {
			int n = scanner.nextInt();
			if(n<=0) {
				continue;
			}else {
				sun = sun+n;
			}
			System.out.println("양수의 합은"+sun);
			
			scanner.close();
		}

	}

}
