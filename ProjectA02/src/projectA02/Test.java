package projectA02;

public class Test {
	public static void main(String[] args) {
		int i = -1;
		int j = 10;
		
		if (i > 0) {
			i = i*10;
		}else if (i < 0) {
			i = i+20;
		}
		
		i = i-j;
		
		System.out.println(i);
	}

}
