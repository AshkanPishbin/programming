package week10.exercise01.logic;

import week10.exercise01.data.Pokemon;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PkSummerizer {

    private List<Pokemon> pokemons = new PkReader().getPokemon();

    //Which are the four high speed pokemon, sorted by speed?
    public List<Pokemon> getFourHigherSpeedPokemon() {
        return pokemons.stream()
                .sorted((p1, p2) -> p2.getSpeed().compareTo(p1.getSpeed()))
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<String> getFourHigherSpeedPokemonNames() {
        return pokemons.stream()
                .sorted((p1, p2) -> p2.getSpeed().compareTo(p1.getSpeed()))
                .limit(4)
                .map(Pokemon::getName)
                .collect(Collectors.toList());


    }

    public Set<Pokemon> getSetOfTheFirstPowerTypes() {
       return pokemons.stream()
                .collect(Collectors.toSet());


    }


}