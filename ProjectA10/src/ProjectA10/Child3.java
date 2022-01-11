package ProjectA10;

class Child3 extends Parent3 implements MyInterface, Myinterface2 {
	public void method1() {
		System.out.println("method1() in Child3");
	}

	@Override
	public void staticMethod() {
		// TODO Auto-generated method stub
		MyInterface.super.staticMethod();
	}
	
	

	
}
