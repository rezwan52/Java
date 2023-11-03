
// Movie class

public class Movie {
    String name;
    double duration;
    double rank;

    Movie(String name, double duration, double rank) {
        this.name = name;
        this.duration = duration;
        this.rank = rank;
    }

    public void reviewThisMovie(boolean isGood, double score) {

        if (isGood == true) {
            rank = rank + score;
        } else {
            rank = rank - score;
        }
    }

    public int getRank() {
        return (int) rank;
    }

    public void display() {
        System.out.println("Movie name: " + name + " Duration: " + duration + " Rank: " + rank);
    }
}