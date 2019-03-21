package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
public class EncoderClient {
    private final RestTemplate restTemplate;

    @Value("${morse.url}")
    private String url;

    public String getEncodedMessage(String message) {
        return Stream.of(message)
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .filter(e -> !e.equals(" "))
                .map(String::toUpperCase)
                .map(e -> restTemplate.postForObject(url, e, String.class))
                .filter(Objects::nonNull)
                .collect(Collectors.joining());


    }
}
