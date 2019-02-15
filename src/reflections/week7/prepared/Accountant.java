package reflections.week7.prepared;

import java.util.List;

public class Accountant {

    private Company company = new Company();
    private Bank bank = new Bank();
    private Statistician statistician = new Statistician();

    public Statistics pay(){
        List<Employee> employees = company.getEmployees();
        transferSalary(employees);
        return statistician.calculate(employees);
    }

    private void transferSalary(List<Employee> employees) {
        for (Employee employee : employees) {
            Integer salary = employee.getSalary();
            String account = employee.getAccount();
            bank.transfer(salary, account);
        }
    }

}
