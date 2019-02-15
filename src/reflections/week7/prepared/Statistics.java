package reflections.week7.prepared;

public class Statistics {

    private Long totalPaid;
    private String mostPayingDepartment;
    private Employee mostPaidEmployee;

    public Long getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Long totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getMostPayingDepartment() {
        return mostPayingDepartment;
    }

    public void setMostPayingDepartment(String mostPayingDepartment) {
        this.mostPayingDepartment = mostPayingDepartment;
    }

    public Employee getMostPaidEmployee() {
        return mostPaidEmployee;
    }

    public void setMostPaidEmployee(Employee mostPaidEmployee) {
        this.mostPaidEmployee = mostPaidEmployee;
    }
}
