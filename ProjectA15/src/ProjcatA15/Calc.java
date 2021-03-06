package ProjcatA15;

public interface Calc {
	
	public class Calculator {
		
		private int su1;
		private int su2;
		private String oper;
		
		private int result;
		
		public Calculator(int su1, int su2, String oper) {
			this.su1 = su1;
			this.su2 = su2;
			this.oper=oper;
			choice();
		}
		
		private void choice() {
			if(oper.equals("+")) plus();
			else if(oper.equals("-")) minus();
			else if(oper.equals("*")) multi();
			else if(oper.equals("/")) div();
		}
		
		public void plus() {
			result = su1+su2;
		}
		
		public void minus() {
			result = su1-su2;
		}
		public void multi() {
			result = su1*su2;		
		}
		public void div() {
			result = su1/su2;
		}
		
		public String getResultstr() {
			return "결과갑:"+su1+oper+su2+"="+result;
		}
	}

}
