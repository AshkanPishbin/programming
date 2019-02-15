package exercises.week11.exercise03;

public abstract class Period {
    private Time start;
    private Time end;
    private String message;

    public Period(Time start, Time end, String message) {
        this.start = start;
        this.end = end;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
