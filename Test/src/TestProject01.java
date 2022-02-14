import java.util.Scanner;

public class TestProject01 {
	public static void main(String[] args) {
		int num, sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요. (0입력시 종료)");
		
		while (true) {
			num = sc.nextInt();
			if(num == 0) {
				
				break;
			}
			
			sum = sum+num;
		
		
		
				
		}
		System.out.println("합계: " + sum  );
		sc.close();
	}
}