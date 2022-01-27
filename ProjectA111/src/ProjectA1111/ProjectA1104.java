package ProjectA1111;

import java.util.StringTokenizer;

public class ProjectA1104 {
	public static void main(String[] args) {
		
		String str = "010-1234-4567";
		String[] num = str.split("-");
		
		String ret1 = num[0];
		String ret2 = num[1];
		String ret3 = num[2];
		
		System.out.println(str);
		System.out.println(ret1);
		System.out.println(ret2);
		System.out.println(ret3);
		
		StringTokenizer st = new StringTokenizer("010-1234-5678", "-");
		System.out.println("010-1234-5678");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
		
		
	}
}
