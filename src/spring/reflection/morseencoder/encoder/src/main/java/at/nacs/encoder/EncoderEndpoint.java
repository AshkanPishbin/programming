package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {

    private final RestTemplate restTemplate;

    @Value("${morse}")
    private String url;

    @GetMapping("/{message}")
    String message(@PathVariable String message) {
        return restTemplate.postForObject(url, message, String.class);
    }
}




