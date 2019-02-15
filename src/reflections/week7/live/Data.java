package reflections.week7.live;

public class Data {

    private Integer totalPaid;
    private String mostPayingDepartment;
    private Worker topSalaryWorker;

    public Data(Integer totalPaid, String mostPayingDepartment, Worker topSalaryWorker) {
        this.totalPaid = totalPaid;
        this.mostPayingDepartment = mostPayingDepartment;
        this.topSalaryWorker = topSalaryWorker;
    }

    public Integer getTotalPaid() {
        return totalPaid;
    }

    public String getMostPayingDepartment() {
        return mostPayingDepartment;
    }

    public Worker getTopSalaryWorker() {
        return topSalaryWorker;
    }
}
