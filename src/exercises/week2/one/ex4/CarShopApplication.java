package exercise.week2.one.ex4;

public class CarShopApplication {

    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car mercedes = new Car("Mercedes");
        Car bmw = new Car("BMW");
        Seller seller = new Seller();
        seller.describe(audi);
        seller.describe(mercedes);
        seller.describe(bmw);
    }

}
