package projectA05;

import java.util.Scanner;

public class projectA0508 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(intArray.length+"개의 점수를 입력하세요>>");
		for(int i =0;i<intArray.length;i++) {
			intArray[i] = scanner.nextInt();
		}
		for(int i=0;i<intArray.length;i++) {
			sum = sum+intArray[i];
		}
		
		System.out.println("평균은"+(double)sum/intArray.length);
		scanner.close();
		

	}

}
