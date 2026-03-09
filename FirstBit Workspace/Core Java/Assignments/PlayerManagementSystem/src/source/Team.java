package source;

public class Team {

    private int teamId;
    private String name;
    private String role;
    private char captainStatus;
    private char activeStatus;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public char getCaptainStatus() {
        return captainStatus;
    }

    public void setCaptainStatus(char captainStatus) {
        this.captainStatus = captainStatus;
    }

    public char getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(char activeStatus) {
        this.activeStatus = activeStatus;
    }
}