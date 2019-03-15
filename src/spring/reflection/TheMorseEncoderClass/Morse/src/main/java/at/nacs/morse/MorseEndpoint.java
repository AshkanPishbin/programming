package at.nacs.morse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseEndpoint {
    @PostMapping
    String letter(@RequestBody String letter) {
        return encoded;

    }
}