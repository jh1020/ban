import java.util.Scanner;

public class Hw1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10~99까지의 숫자만 입력하세요: ");
		int num = sc.nextInt();
		
		int div = num/10;
		int rem = num%10;
		int sum = 0;
		
		

		System.out.println(rem);
		
		while(rem >= 0) {
			
			sum = sum + ((div*10)+(rem*8));
			System.out.println(sum);
			rem--;
		}
		System.out.println("총 합은 "+sum+ "입니다.");
		
	
	}
}
