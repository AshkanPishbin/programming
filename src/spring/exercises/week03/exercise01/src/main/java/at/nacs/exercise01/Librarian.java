package at.nacs.exercise01;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("bookshop")
public class Liberarian {

    @Getter
    @Setter
    private Map<String, Integer> books;



}
