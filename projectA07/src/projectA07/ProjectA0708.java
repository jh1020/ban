package projectA07;

class Song{
	private String title="";
	private String artist="";
	private int year = 1900;
	private String country="";
	public Song() {
		
	}
	
	public Song(String title, String artist, int year, String country ) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}
	public void show() {
		System.out.print(this.year + "년 ");
		System.out.print(this.country + "국적의 ");
		System.out.print(this.artist + "가 부른 ");
		System.out.print(this.title);
	}
	
}

public class ProjectA0708 {
	
	
	
	public static void main(String[] args) {
		Song song = new Song();
		song.show();
		
		Song myFavorite = new Song("Dancing Queen","ABBA", 1978, "스웨덴" );
		
		myFavorite.show();
		
		
		
		
	}
}
