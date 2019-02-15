package challenge.debtcalculator;

public class Person {

    private String name;
    private Double paid;
    private Double difference;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }
}
