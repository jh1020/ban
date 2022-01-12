package ProjectA11;

public class ProjectA1101 {

}

class Tv2 {
	private int size;
	public Tv2(int size) { this.size = size;}
	protected int getSize() { return size;}
		
	
}

class ColorTv2 extends Tv2 {
	private int nColors;
	public ColorTv2(int size, int nColors) {
		super(size) ;
		this.nColors = nColors;
		
		
	}
	
	protected int getnColors() {
		return nColors;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치" + nColors + "컬러");
	}
	
}


