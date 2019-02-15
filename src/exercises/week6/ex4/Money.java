package exercises.week6.ex4;

public abstract class Money {

    private Integer amount;

    public Money(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public boolean isApplicable(Integer amount) {
        return this.amount <= amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }
}
