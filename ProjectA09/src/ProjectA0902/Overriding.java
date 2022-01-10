package ProjectA0902;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class cannon extends Weapon {
	@Override
	protected int fire() {
		return 10;
	}
}





public class Overriding {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상능력은 " + weapon.fire());
		
		weapon = new cannon();
		System.out.println("대포의 살상능력은 " + weapon.fire());
		
		
		
		
	}

}
