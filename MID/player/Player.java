// Player class

public class Player {

    String name, teamName;
    int noOfMatchesPlayed;

    Player(String name, String teamName, int noOfMatchesPlayed) {

        this.name = name;
        this.teamName = teamName;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
    }

    public void playMatches(int count) {
        if (count >= 0) {
            noOfMatchesPlayed = noOfMatchesPlayed + count;
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void display() {
        System.out.println("Name: " + name + " Team name: " + teamName + " No of Matches played: " + noOfMatchesPlayed);
    }

}