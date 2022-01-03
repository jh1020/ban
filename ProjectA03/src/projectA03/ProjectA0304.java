package projectA03;

import java.util.Scanner;

public class ProjectA0304 {

	public static void main(String[] args) {
		final double rate = 1200.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력 하세요(단위 원)>>");
		int won = scanner.nextInt();
		double dollar = won/rate;
		System.out.println(won + "원은" +dollar +"$ 입니다.");
		scanner.close();
		
		
	}

}
