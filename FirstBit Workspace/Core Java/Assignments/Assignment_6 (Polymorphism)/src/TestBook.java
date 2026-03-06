class Book{
	String title;
	String author;
	String publisher;
	double price;
	int pages;
	
	public Book() {
		this.title = "Not Given";
		this.author = "Not Given";
		this.publisher = "Not Given";
		this.price = 0;
		this.pages = 0;
	}

	Book(String title, String author, String publisher, double price, int pages) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pages = pages;
	}
	
	void getBookType() {
		System.out.println("Book Type..!");
	}

	@Override
	public String toString() {
		return "title=" + title + "\nauthor=" + author + "\npublisher=" + publisher + "\nprice=" + price
				+ "\npages=" + pages;
	}

	
}

class EBook extends Book{
	double fileSize;
	String format;
	
	public EBook() {
		super();
		this.fileSize = 0;
		this.format = "Not Given";
	}

	EBook(String title, String author, String publisher, double price, int pages, double fileSize, String format) {
		super(title, author, publisher, price, pages);
		this.fileSize = fileSize;
		this.format = format;
	}

	@Override
	public String toString() {
		return super.toString()+"\nfileSize=" + fileSize + "\nformat=" + format;
	}

	void getBookType() {
		System.out.println("Book Name: " + this.title);
		System.out.println("Book Type: " + this.format);
	}
}

class PrintedBook extends Book{
	double weight;
	String coverType;
	
	public PrintedBook() {
		super();
		this.weight = 0;
		this.coverType = "Not Given";
	}

	PrintedBook(String title, String author, String publisher, double price, int pages, double weight, String coverType) {
		super(title, author, publisher, price, pages);
		this.weight = weight;
		this.coverType = coverType;
	}

	@Override
	public String toString() {
		return super.toString() + "\nweight=" + weight + "\ncoverType=" + coverType;
	}

	void getBookType() {
		System.out.println("Book Name: " + this.title);
		System.out.println("Book Type: " + this.coverType);
	}
	
}

public class TestBook{
	public static void main(String[] args) {
		
		EBook e1 = new EBook("Java Programming", "James Gosling", "Sun", 499, 550, 5.5, "PDF");
		PrintedBook p1 = new PrintedBook("Data Structures", "Mark Allen", "McGraw Hill", 699, 720, 1.2, "Hardcover");
		
//		System.out.println(e1);
//		System.out.println();
//		System.out.println(p1);
		
		e1.getBookType();
		System.out.println();
		p1.getBookType();
	}
}