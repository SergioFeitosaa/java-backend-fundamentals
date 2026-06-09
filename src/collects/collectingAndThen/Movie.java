package collects.collectingAndThen;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Movie {
    private String title;
    private String genre;
    private double rating;
    private boolean available;

    public Movie(String title, String genre, double rating, boolean available) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Interestelar", "SCI_FI", 9.5, true);
        Movie movie2 = new Movie("Batman", "ACTION", 8.0, true);
        Movie movie3 = new Movie("Clube da luta", "DRAMA", 9.2, true);
        Movie movie4 = new Movie("Vingadores", "ACTION", 8.9, true);
        Movie movie5 = new Movie("O Poderoso Chefão", "DRAMA", 9.8, false);
        Movie movie6 = new Movie("Matrix", "SCI_FI", 9.0, true);

        List<Movie> movies = List.of(movie1, movie2, movie3, movie4, movie5, movie6);
        Map<String, String> filmesDisponiveis = movies.stream()
                .filter(Movie::isAvailable)
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Movie::getRating)),
                                optionalMovie -> optionalMovie
                                        .orElseThrow()
                                        .getTitle())));
        System.out.println(filmesDisponiveis);
    }
}
