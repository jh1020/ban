package ProjectA12;

import java.util.Scanner;

public class ProjectA1202 {

}

abstract class Converter2 {
	abstract protected double convert (double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected  double ratio;


	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.println();
		System.out.println(srcString() + " 을 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과: " + res + destString() + "입니다.");
		sc.close();
		
	}
}

class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String srcString() {
		return "Km";
	}

	@Override
	protected String destString() {
		return "mile";
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
	
	
	
	
	
	
	
}


