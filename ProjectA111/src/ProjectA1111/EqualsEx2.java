package ProjectA1111;

class Rect {
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals2(Object obj) {
		Rect p = (Rect)obj;
		if(width*height == p.width*p.height) {
			return true;
		}else {
			return false;
		}
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		
		if (a.equals2(b)) {
			System.out.println("a equal to b");
		}
		
		if (a.equals2(c)) {
			System.out.println("a equal to c");
		}
		
		if (b.equals2(c)) {
			System.out.println("b equal to c");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
