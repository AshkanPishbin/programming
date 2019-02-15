package exercises.week10.exercise01.logic;


import exercises.week10.exercise01.data.Pokemon;
import exercises.week10.exercise01.reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PkReader {
    public List<Pokemon> getPokemon() {

        return new FileReader().asList("week10/resource/pokemon.csv").stream()
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Pokemon(
                                Integer.valueOf(s[0]),
                                s[1],
                                s[2],
                                s[3],
                                Integer.valueOf(s[4]),
                                Integer.valueOf(s[5]),
                                Integer.valueOf(s[6]),
                                Integer.valueOf(s[7]),
                                Integer.valueOf(s[8]),
                                Integer.valueOf(s[9]),
                                Integer.valueOf(s[10]),
                                Integer.valueOf(s[11]),
                                Boolean.valueOf(s[12])
                        ))
                .collect(Collectors.toList());


    }
}
