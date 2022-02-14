import java.util.Scanner;

public class Hw1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		double sum = 1;
		
		for(int i = 1; i <= a; i++) {
			sum = sum+(Math.pow(2, i));

			System.out.println(sum);
		}

		System.out.println(a +"의 배수의 합은: "+(sum));
	}
}
