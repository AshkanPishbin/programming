package reflections.fruitShop.src.Controller;

import lombok.Data;
import lombok.experimental.UtilityClass;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
@Data
public class Assistant {

        public List<Fruit> toFruit(List<String> lines) {
            return lines.stream()
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                    .entrySet().stream()
                    .map(e -> Fruit.builder().name(e.getKey()).amount(e.getValue()).build())
                    .collect(Collectors.toList());
        }
    }

