import java.util.Scanner;

public class Hw1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 0;

		
		for(int i = 1; i  <= 500; i++) {
			num = num + (a*i);
		}
		System.out.println(num);
		
		
		
		
		
	}
}
