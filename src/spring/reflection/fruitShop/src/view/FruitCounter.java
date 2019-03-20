package view;

import Controller.Assistant;
import Controller.FileReader;
import Controller.Fruit;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

import java.util.List;

@UtilityClass
@Log
public class FruitCounter {
    private List<String> fruitNames = (List<String>) FileReader.lines("reflection/fruitshop/file/delivery.txt");
    private List<Fruit> fruits = Assistant.toFruit(fruitNames);

    public void display() {
        log.info("These are all our tasteful fruits:");
        fruits.stream()
                .forEach(e -> System.out.println(e.getAmount() + " " + e.getName()));
    }
}