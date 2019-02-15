package reflections.week10.logic;

import reflections.week10.reader.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class AdventureReader {

        public List<String> getLine(){

            return new FileReader().asStream("reflections/week10/refrence/alice.txt")
                    .map(String::toLowerCase)
                    .map(e->e.replaceAll(","," "))
                    .map(e->e.replaceAll(";"," "))
                    .map(e->e.replaceAll("’s"," "))
                    .map(e->e.replaceAll("’"," "))
                    .map(e->e.replaceAll("‘"," "))
                    .map(e->e.replaceAll(":"," "))
                    .map(e->e.replaceAll("#"," "))
                    .map(e->e.replaceAll("/"," "))
                    .map(e->e.replaceAll("-"," "))
                    .map(e->e.replaceAll(" \\."," "))
                    .map(e->e.replaceAll(" \\*"," "))
                    .map(e->e.replaceAll(" \\("," "))
                    .map(e->e.replaceAll(" \\)"," "))
                    .map(e->e.replaceAll(" \\["," "))
                    .map(e->e.replaceAll(" \\]"," "))
                    .collect(Collectors.toList());
        }
    }

