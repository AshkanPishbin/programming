package at.nacs.handshakes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@ConfigurationProperties("gesture")
@Component
public class BodyLanguageHandshake {
    @Getter
    @Setter
    private Map<Integer, String> handshake;
}
