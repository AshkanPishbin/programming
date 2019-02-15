package exercise.week2.two.ex3;

import java.util.List;

public class BootShopApplication {

    public static void main(String[] args) {
        BootShopAssistant assistant = new BootShopAssistant();
        List<HikingBoot> recommendations = assistant.getHikingBootRecommendations();
        Hansel hansel = new Hansel();
        hansel.tryHikingBoots(recommendations);
    }

}
