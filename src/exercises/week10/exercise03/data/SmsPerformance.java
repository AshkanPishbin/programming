package exercises.week10.exercise03.data;

public class SmsPerformance {
    private String lable;
    private String message;

    public String getLable() {
        return lable;
    }

    public String getMessage() {
        return message;
    }

    public SmsPerformance(String lable, String message) {
        this.lable = lable;
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsPerformance{" +
                "lable='" + lable + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
