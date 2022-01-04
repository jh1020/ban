package projectA07;

import java.nio.channels.Channel;

public class ProjectA0702 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1 의 channel 값은" + t1.channel + "입니다.");
		System.out.println("t2 의 channel 값은" + t2.channel + "입니다.");
		
		t1.channel = 24;
		System.out.println("t1의 channel 값을 24로 변경하였습니다.");
		t2.channel = 22;
		
		System.out.println("t1 의 channel 값은" + t1.channel + "입니다.");
		System.out.println("t1 의 channel 값은" + t2.channel + "입니다.");
		
	}

}
