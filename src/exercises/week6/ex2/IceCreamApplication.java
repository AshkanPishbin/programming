package exercises.week6.ex2;

public class IceCreamApplication {

    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Chocolate", "Oreo");
        String response = cone.eat();
        System.out.println(response);

        IceCream cup = new CupIceCream("Vanilla", "Cookies");
        String response2 = cup.eat();
        System.out.println(response2);
    }
}
