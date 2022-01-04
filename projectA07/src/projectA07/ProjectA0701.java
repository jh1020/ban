package projectA07;

class Tv{
	//TV의 속성 멤버변수
	String color = "칼라";
	boolean power = false;
	int channel = 0;
	
	//TV의 기능(메서드)
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel = channel + 1;
	}
	
	void channelDown() {
		channel = channel - 1;
	}
	
}

public class ProjectA0701 {
	
	
	
	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		t.channelDown();
		t.channelUp();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}
