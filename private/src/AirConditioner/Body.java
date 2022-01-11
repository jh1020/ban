package AirConditioner;

import java.util.Scanner;

class Power {
	boolean power() {
		return false;
	} 
}

class Rotate {
	boolean rotate() {
		return false;
	} 
}

class Tmp {
	boolean power() {
		return false;
	} 
}

class WindPower {
	boolean power() {
		return false;
	} 
}

public class Body {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		if(sc.equals("on")) {
			boolean Power = true;
			System.out.println("전원이 켜졌습니다.");
		}
	}
}
