import java.io.*;

public class Reservation {
	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
	private static final File file = new File("reservations.txt");

	public Reservation(long id, long movieId, String movieTitle, String seatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}

	public static Reservation findById(String reservationId) throws IOException {
		Reservation r = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;

		while ((line = br.readLine()) != null) {

			String[] temp = line.split(",");
			if (reservationId.equals(temp[0])) {
				r = new Reservation(Long.parseLong(temp[0]), Long.parseLong(temp[1]), temp[2], temp[3]);
				break;
			}
		}
		br.close();
		return r;
	}

	public String toString() {
		return String.format("영화: %s, 좌석: %s", movieTitle, seatName);
	}
	public static Reservation cancle(String reservationId) throws 
		IOException {
		
		Reservation cancled = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "" ;
		String line = null;
		
		while ((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			if(reservationId.equals(temp[0])) {
				cancled = new Reservation(
						Long.parseLong(temp[0]),
						Long.parseLong(temp[1]),
						temp[2],
						temp[3]
								);
				continue;
			}
			text += line + "\n";
		}
		br.close();
		
		FileWriter fw = new FileWriter(file);
		
		fw.write(text);
		fw.close();
		return cancled;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}