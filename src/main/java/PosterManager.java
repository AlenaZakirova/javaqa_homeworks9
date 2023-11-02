public class PosterManager {
    private String[] movies = new String[0];
    private final int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] newMoviesLength = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMoviesLength[i] = movies[i];
        }
        newMoviesLength[newMoviesLength.length - 1] = movie;
        movies = newMoviesLength;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int lastAddedMoviesLength;
        if (movies.length > limit) {
            lastAddedMoviesLength = limit;
        } else {
            lastAddedMoviesLength = movies.length;
        }
        String[] lastAddedMovies = new String[lastAddedMoviesLength];
        for (int i = 0; i < lastAddedMovies.length; i++) {
            lastAddedMovies[i] = movies[movies.length - 1 - i];
        }
        return lastAddedMovies;
    }
}
