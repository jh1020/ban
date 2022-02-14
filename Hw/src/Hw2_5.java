	
public class Hw2_5 {
	public static void main(String[] args) {
		for(int i = 1; i<=8; i++) {
			for(int j = 1; j <=i+i; j++) {
				if(j == 1) {
					System.out.print(1);
				}else if(j == (i+i)) {
					System.out.print("00"+i);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
