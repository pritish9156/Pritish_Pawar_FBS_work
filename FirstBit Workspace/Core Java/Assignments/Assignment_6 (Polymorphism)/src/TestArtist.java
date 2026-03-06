class Artist{
	String name;
	int age;
	
	public Artist() {
		// TODO Auto-generated constructor stub
		this.name = "Not Given";
		this.age = 0;
	}

	Artist(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age;
	}

	void perform() {
		System.out.println("Artist Performing..!");
	}
}

class Painter extends Artist{
	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;
	
	public Painter() {
		// TODO Auto-generated constructor stub
		super();
		this.paintingStyle = "Not Given";
		this.mediumUsed = "Not Given";
		this.numberOfPaintings = 0;
	}

	Painter(String name, int age, String paintingStyle, String mediumUsed, int numberOfPaintings) {
		super(name, age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPaintings = numberOfPaintings;
	}

	String getPaintingStyle() {
		return paintingStyle;
	}

	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	String getMediumUsed() {
		return mediumUsed;
	}

	void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}

	int getNumberOfPaintings() {
		return numberOfPaintings;
	}

	void setNumberOfPaintings(int numberOfPaintings) {
		this.numberOfPaintings = numberOfPaintings;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\npaintingStyle=" + paintingStyle + "\nmediumUsed=" + mediumUsed + "\nnumberOfPaintings="
				+ numberOfPaintings;
	}

	void perform() {
		System.out.println("Selecting paper style\nSelecting Art type: classic\n selecting intruments\n Performing..!");
	}
}

class Musician extends Artist{
	String instrument;
	String musicGenre;
	int numberOfAlbums;
	
	public Musician() {
		// TODO Auto-generated constructor stub
		super();
		this.instrument = "Not Given";
		this.musicGenre = "Not Given";
		this.numberOfAlbums = 0;
	}

	Musician(String name, int age, String instrument, String musicGenre, int numberOfAlbums) {
		super(name, age);
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}

	String getInstrument() {
		return instrument;
	}

	void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	String getMusicGenre() {
		return musicGenre;
	}

	void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}

	int getNumberOfAlbums() {
		return numberOfAlbums;
	}

	void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"\ninstrument=" + instrument + "\nmusicGenre=" + musicGenre + "\nnumberOfAlbums="
				+ numberOfAlbums;
	}

	void perform() {
		System.out.println("Selecting intrument: guitar\nTuning up guitar\nPerforming..!");
	}
	
}

class Actor extends Artist{
	String filmIndustry;
	int numberOfMovies;
	
	public Actor() {
		// TODO Auto-generated constructor stub
		super();
		this.filmIndustry = "Not Given";
		this.numberOfMovies = 0;
	}

	Actor(String name, int age, String filmIndustry, int numberOfMovies) {
		super(name, age);
		this.filmIndustry = filmIndustry;
		this.numberOfMovies = numberOfMovies;
	}

	String getFilmIndustry() {
		return filmIndustry;
	}

	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}

	int getNumberOfMovies() {
		return numberOfMovies;
	}

	void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"\nfilmIndustry=" + filmIndustry + "\nnumberOfMovies=" + numberOfMovies;
	}

	void perform() {
		System.out.println("Taking acting classes\n Doing makeup\n Performing..!");
	}
	
}


public class TestArtist {

	public static void main(String[] args) {
		
		Artist a1;
		a1 = new Painter("Raghu", 26, "classic", "Digital", 100);
		System.out.println(a1);
		a1.perform();
		System.out.println();
		
		a1 = new Musician("Ramesh", 24, "Guitar", "Rock", 29);
		System.out.println(a1);
		a1.perform();
		System.out.println();
		
		a1 = new Actor("Santosh", 43, "Bollywood", 45);
		System.out.println(a1);
		a1.perform();
	}

}
