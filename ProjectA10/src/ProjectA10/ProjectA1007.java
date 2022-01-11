package ProjectA10;

public class ProjectA1007 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남음 돈은" + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니다.");
	}

}
