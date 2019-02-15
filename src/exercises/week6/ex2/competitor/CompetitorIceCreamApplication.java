package exercise.week6.ex2.competitor;

import exercise.week6.ex2.ConeIceCream;
import exercise.week6.ex2.CupIceCream;
import exercise.week6.ex2.IceCream;

public class CompetitorIceCreamApplication {

    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Peach", "Nuts");
//        cone.getFlavor()
//        cone.getTopping()
//        it doesn't work
        IceCream cup = new CupIceCream("Strawberry", "Pistachio");
//        cup.getFlavor()
//        cup.getTopping()
//        it doesn't work
    }

}
