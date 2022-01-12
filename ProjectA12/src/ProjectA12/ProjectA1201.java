package ProjectA12;

import java.util.Scanner;

 class ProjectA1201 {

}

 abstract class Converter {
	 abstract protected double convert(double src);
	 abstract protected String srcString();
	 abstract protected	String destString();
	 protected double ratio;
	 
	 public void run() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		 System.out.println(srcString() + "을 입력하세요>> ");
		 double val = sc.nextDouble();
		 double res = convert(val);
		 System.out.println("변환 결과: " + res + destString() + "입니다.");
		 sc.close();
		  }
 }
 
class Won2Dollar extends Converter {
	 
	 public Won2Dollar(double ratio) {
		 this.ratio = ratio;
	 }
	 
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String srcString() {
		return "원";
	}

	@Override
	protected String destString() {
		return "달러";
	}
	 
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
	
	
 }
 
 
 
 