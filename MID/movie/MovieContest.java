
// MovieContest Class

public class MovieContest {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Pathan", 63, 3);

        myMovie.reviewThisMovie(true, 3);
        myMovie.display();
    }
}

// output: Movie name: Pathan Duration: 63.0 Rank: 6.0