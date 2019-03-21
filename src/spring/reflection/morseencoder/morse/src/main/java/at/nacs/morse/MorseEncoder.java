package at.nacs.morse;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
@ConfigurationProperties("morse")
@Setter
@Getter
public class MorseEncoder {

    private Map<String,String> morsechart;

    public String encoder(String letter){
        return morsechart.get(letter);
    }

}
