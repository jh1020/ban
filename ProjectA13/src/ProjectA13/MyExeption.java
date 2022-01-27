package ProjectA13;

public class MyExeption extends Exception{
	private final int ERR_CODE;
	public MyExeption(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	public MyExeption(String msg) {
		this(msg, 100);
	}
	public int getErrcode() {
		return ERR_CODE;
	}
}
