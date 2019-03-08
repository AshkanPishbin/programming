package at.nacs.handshakes;

import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Transformer {
    private final Price price;
    private final BodyLanguageHandshake bodyLanguageHandshake;

    public List<String> transform(Integer number) {
        Map<Integer, String> handshake = bodyLanguageHandshake.getHandshake();
        List<Integer> splitter = price.splitter(number);
        return splitter.stream()
                .filter(e -> handshake.containsKey(e))
                .map(e -> handshake.get(e))
                .collect(Collectors.toList());


    }
}