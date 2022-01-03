package projectA05;

import java.util.Scanner;

public class projectA0513 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int division;
		
		while(true) {
			System.out.print(" 나누어지는 수를 입력하시오:");
			dividend = scanner.nextInt();
			System.out.print(" 나누는를 입력하시오:");
			division = scanner.nextInt();
			try {
				System.out.print(dividend+" 를"+division+"으로 나눈 몫은"+dividend/division);
				break;
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
			}
			scanner.close();
		}
		

	}

}
