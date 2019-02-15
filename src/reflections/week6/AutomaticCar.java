package reflection.week6.easy;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Automatic";
    }


}
