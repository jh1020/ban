
public class Hw1_5 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == 3 && j == 3) {
					System.out.print(3);
				}else if(j == 3){
					System.out.print(0);
				}else if(i == 6&&j == 6) {
					System.out.print(6);
				}else if(j==6) {
					System.out.print(0);
				}else if(i == 8&&j == 8) {
					System.out.print(8);
				}else if(j == 8) {
					System.out.print(0);
				}
				
				else {
					System.out.print(j);
				}
				
			}

			System.out.println("");
		}
		
		for(int i = 8; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				if(i == 3 && j == 3) {
					System.out.print(3);
				}else if(j == 3){
					System.out.print(0);
				}else if(i == 6&&j == 6) {
					System.out.print(6);
				}else if(j==6) {
					System.out.print(0);
				}else if(i == 8&&j == 8) {
					System.out.print(8);
				}else if(j == 8) {
					System.out.print(0);
				}
				
				else {
					System.out.print(j);
				}
			}
			System.out.println("");
		}
		
		
		
	}
}
