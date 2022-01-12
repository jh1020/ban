package ProjectA11;

class JavaTv {
	private int size;
	public JavaTv(int size) {this.size = size;}
	protected int getSize() {return size; }
}

class ColorTv extends JavaTv {
	private int nColors;
	public ColorTv(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치" + nColors + "컬러");
	}
	
	public static void main(String [] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
	}

}




