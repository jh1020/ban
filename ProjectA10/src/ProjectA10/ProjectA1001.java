package ProjectA10;

public class ProjectA1001 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true;
		stv.displayCaption("Hello, world");
		
		
		
	}

}
