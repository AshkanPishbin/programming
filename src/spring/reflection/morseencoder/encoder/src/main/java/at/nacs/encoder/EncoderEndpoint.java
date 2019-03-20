package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {

    private final RestTemplate restTemplate;

    @Value("${morse}")
    private String url;

    @PostMapping()
    String addMessage(@RequestBody String message) {
        return restTemplate.postForObject(url, message, String.class);
    }
}




