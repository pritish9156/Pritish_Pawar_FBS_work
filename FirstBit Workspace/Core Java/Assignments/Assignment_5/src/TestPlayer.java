class Player{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;
	
	public Player() {
		// TODO Auto-generated constructor stub
		this.name = "Not Given";
		this.age = 0;
		this.country = "Not Given";
		this.matchesPlayed = 0;
		this.jerseyNumber = 0;
	}

	Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
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

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	int getMatchesPlayed() {
		return matchesPlayed;
	}

	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	int getJerseyNumber() {
		return jerseyNumber;
	}

	void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	void display() {
		System.out.println("Player Name: " + this.name);
		System.out.println("Player Age: " + this.age);
		System.out.println("Player Country: " + this.country);
		System.out.println("Matches Played: " + this.matchesPlayed);
		System.out.println("Jersey Number: " + this.jerseyNumber);
	}
}

class CricketPlayer extends Player{
	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	public CricketPlayer() {
		// TODO Auto-generated constructor stub
		super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battingStyle = "Not Given";
		this.bowlingStyle = "Not Given";
	}

	CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalRuns, int totalWickets, String battingStyle, String bowlingStyle) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	int getTotalRuns() {
		return totalRuns;
	}

	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	int getTotalWickets() {
		return totalWickets;
	}

	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	String getBattingStyle() {
		return battingStyle;
	}

	void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	String getBowlingStyle() {
		return bowlingStyle;
	}

	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	
	void display() {
		super.display();
		System.out.println("Total Runs: " + this.totalRuns);
		System.out.println("Total Wickets: " + this.totalWickets);
		System.out.println("Batting Style: " + this.battingStyle);
		System.out.println("Bowling Style: " + this.bowlingStyle);
	}
}

class FootballPlayer extends Player{
	int totalGoals;
	String playingPosition;
	
	public FootballPlayer() {
		// TODO Auto-generated constructor stub
		super();
		this.totalGoals = 0;
		this.playingPosition = "Not Given";
	}

	FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalGoals, String playingPosition) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalGoals = totalGoals;
		this.playingPosition = playingPosition;
	}

	int getTotalGoals() {
		return totalGoals;
	}

	void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	String getPlayingPosition() {
		return playingPosition;
	}

	void setPlayingPosition(String playingPosition) {
		this.playingPosition = playingPosition;
	}
	
	void display() {
		super.display();
		System.out.println("Total Goals: " + this.totalGoals);
		System.out.println("Player Position: " + this.playingPosition);
	}
}//football class ends here

public class TestPlayer {

	public static void main(String[] args) {
		
		CricketPlayer p1 = new CricketPlayer("Pritish Pawar", 22, "India", 100, 91, 1000, 500, "As Usual", "Cant Predict");
		FootballPlayer f1 = new FootballPlayer("Ramesh", 25, "India", 40, 30, 10, "Goal keeper");
		
		p1.display();
		System.out.println();
		f1.display();
	}

}
