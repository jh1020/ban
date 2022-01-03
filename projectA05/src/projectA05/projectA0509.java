package projectA05;

public class projectA0509 {
	
	enum Week{월, 화, 수, 목, 금,토,일};

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for(int k: num) {
			sum = sum+k;
		}
		System.out.println("합은: "+sum);
		String[] names = {"사과", "배","딸기","바나나","포도"};
		for(String s: names) {
			System.out.println(s+" ");
		}
		System.out.println("");
		
		
		for(Week day:Week.values()) {
			System.out.println(day+"요일");
		}
	}

}
