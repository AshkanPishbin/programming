package exercises.week09.exercise05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {
    List<Film> films = new FilmReader().getFilms();

    void display() {
        displayThreeHighestRatingFilms();
        displayThreeHighestRatingLongerFilms();
        displayFourMostExpensiveFilms();
        displayFourMostExpensiveShorterFilms();
        displayFourTopMostRatedHigherBudgetFilms();
    }

    private List<Film> displayThreeHighestRatingFilms() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    private List<Film> displayThreeHighestRatingLongerFilms() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .filter(film -> film.getRuntime() > 180)
                .limit(3)
                .collect(Collectors.toList());
    }

    private List<Film> displayFourMostExpensiveFilms() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    private List<Film> displayFourMostExpensiveShorterFilms() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getRuntime))
                .filter(film -> film.getRuntime() < 90)
                .limit(4)
                .collect(Collectors.toList());
    }

    private List<Film> displayFourTopMostRatedHigherBudgetFilms() {
        return films.stream()
                .filter(film -> film.getScore() > 7)
                .filter(film -> film.getBudget() > 50000)
                .filter(film -> film.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }


}


