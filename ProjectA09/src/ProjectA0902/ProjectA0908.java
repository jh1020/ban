package ProjectA0902;

interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void recevieCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리링");
		
	}

	@Override
	public void recevieCall() {
		System.out.println("전화가 왔습니다.");
		
		
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
	
}

public class ProjectA0908 {
	
	
	
	
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.recevieCall();
		phone.flash();
		
		
		
	


	}

}
