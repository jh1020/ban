package projectA03;

public class ProjectA0312 {
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n",(short)(a & b));
		System.out.printf("%04x\n",(short)(a | b));
		System.out.printf("%04x\n",(short)(a ^ b));
		System.out.printf("%04x\n",(short)(-a));
		
		byte c = 20;
		byte d = -8;
		
		System.out.println("[시프트 연산 결과]");
		System.out.println();
		
		
		
	}
}
