package at.nacs.encoder;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {

    private final EncoderClient encoderClient;

    @PostMapping()
    String addMessage(@RequestBody String message) {
        return encoderClient.getEncodedMessage(message);

    }
}




