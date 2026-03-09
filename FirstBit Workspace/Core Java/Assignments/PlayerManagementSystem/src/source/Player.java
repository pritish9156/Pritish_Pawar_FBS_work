package source;

public class Player {

    private int id;
    private String name;
    private int age;
    private char gender;
    private int jerseyNum;

    private Team teamInfo;
    private PerformanceStats performance;
    private SystemInfo sysInfo;

    public Player() {
        teamInfo = new Team();
        performance = new PerformanceStats();
        sysInfo = new SystemInfo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public Team getTeamInfo() {
        return teamInfo;
    }

    public PerformanceStats getPerformance() {
        return performance;
    }

    public SystemInfo getSysInfo() {
        return sysInfo;
    }
}