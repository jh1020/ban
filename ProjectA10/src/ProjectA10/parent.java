package ProjectA10;

class parent {
	int x = 10;
}

class Child extends parent {
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x =" + this.x );
		System.out.println("super.x =" + super.x);
	}
}