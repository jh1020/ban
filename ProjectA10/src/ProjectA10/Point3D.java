package ProjectA10;

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		super.x = 10;
		super.y = 20;
	}
}
