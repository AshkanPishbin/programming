package at.nacs.handshakes;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Component
public class Price {

    public List<Integer> splitter(Integer number){

        return Stream.of(number)
                .map(e->e.toString())
                .map(e->e.split(""))
                .flatMap(Stream::of)
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());



    }

}
