
public class Test2 {
	public static void main(String[] args) {
		int rs = 5000000;
		for(int i = 10; i >= -10; i--) {
			rs /= i;
			System.out.println(rs);
		}
	}
}
