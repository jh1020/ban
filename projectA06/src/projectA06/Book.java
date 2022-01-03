package projectA06;

public class Book {
	String title;
	String author;
	int price;
	
	public Book(String t) {
		title = t;
		author = "작가미상";
	}
	
	public Book(String t, int p, String a) {
		title = t;
		price = p;
		author = a;
	}
	
	public Book (int p) {
		title = "홍길동전";
		price = p;
		author = "미상";
		
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlPrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		
		Book book2 =new Book(10000);
		
		Book book3 = new Book(30000);
		
		Book book4 = new Book("어린왕자", 11000, "생텍쥐페리");
		
		System.out.println(littlPrince.title + " "+ "" + littlPrince.author);
		
		System.out.println(loveStory.title + " " + loveStory.author);
		
		System.out.println(book2.title + " " + book2.author);
		
		System.out.println(book3.title + " " + book3.author);
		
		System.out.println(book4.title + " " + book4.author + " " + book4.price
				);
		
	}

}
