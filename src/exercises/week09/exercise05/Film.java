package exercises.week09.exercise05;

public class Film {
    private String title;
    private Double score;
    private Integer voteCount;
    private Integer runtime;
    private Long budget;
    private Long revenue;

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Film(String title, Double score, Integer voteCount, Integer runtime, Long budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return title;
    }
}
