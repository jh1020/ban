package ProjectA11;

public class IPTV extends ColorTv{
	private String ipAddr;
	public IPTV(String ipAddr, int size, int nColors) {
		super(size, nColors);
		this.ipAddr = ipAddr;
	}
	public void prontProperty() {
		System.out.println("나의 IPTV는 " + ipAddr + " 주소의");
		super.printProperty();
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
	
}
