package projectA05;

import java.util.Scanner;

public class projectA0506 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료됩니다.");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			if(text.equals("exit")) {
				break; //while의 브레이크문
			}else if(text.equals("sum")) {
				System.out.println("1+1="+(1+1));
			}
		}
		System.out.println("종료");
		scanner.close();

	}

}
