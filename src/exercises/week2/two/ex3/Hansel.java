package exercise.week2.two.ex3;

import java.util.List;

public class Hansel {

    private Integer footSize = 41;

    private boolean isRightSize(HikingBoot boot) {
        return footSize.equals(boot.getSize());
    }

    public void tryHikingBoots(List<HikingBoot> boots) {
        for (HikingBoot boot : boots) {
            if (isRightSize(boot)) {
                System.out.println("I'm buying this one, thanks!");
                return;
            }
            System.out.println("This one does not fit, sorry.");
        }
    }

}
