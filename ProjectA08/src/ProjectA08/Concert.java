package ProjectA08;

import java.util.Scanner;

public class Concert {
	private String hollName;
	private Group[] group = new Group[3] ;
	private Scanner sc = new Scanner(System.in);
	
	public Concert(String hallNmae) {
		this.hollName = hallNmae;
		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}
	
	private void reserve() {
		System.out.println("좌석구분S(1),A(2),B(3)>>");
		int type = sc.nextInt();
		if(type<1||type>3) {
			System.out.println("잘못된 좌석 타입입니다.");
			return;
		}
		group[type - 1].reserve();
	}
	
	private void search() {
		for(int i=0; i<group.length;i++) {
			group[i].show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	private void cancel() {
		System.out.println("좌석 S:1, A:2, B:3>>");
		int type = sc.nextInt();
		if(type<1||type>3) {
			System.out.println("잘못된 좌석 타입입니다.");
			return ;
		}
		group[type - 1].cancel();
	}
	
	public void run() {
		System.out.println(hollName + "예약시스템 입니다.");
		int choice = 0;
		while(choice !=4) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
		
			}sc.close();
		}
	}
	
	
	
	
	
}
