package Controller;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Fruit {
        private String name;
        private Long amount;

        @Override
        public String toString() {
            return amount + " " + name;
        }
    }


