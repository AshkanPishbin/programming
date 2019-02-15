package exercises.week09.exercise05;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {
    public List<Film> getFilms() {
        return new FileReader().asStream("exercises/week09/exercise05/films.csv")
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Film(s[8], Double.valueOf(s[9]), Integer.valueOf(s[10]), Integer.valueOf(s[6]), Long.valueOf(s[0]), Long.valueOf(s[5])))
                .collect(Collectors.toList());
    }

}



