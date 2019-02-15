package reflections.week7.prepared;

import java.util.*;

public class Statistician {
    public Statistics calculate(List<Employee> employees) {
        Statistics statistics = new Statistics();
        statistics.setTotalPaid(calculateTotalPaid(employees));
        statistics.setMostPayingDepartment(getMostPayingDepartment(employees));
        statistics.setMostPaidEmployee(getMostPaidEmployee(employees));
        return statistics;
    }

    private Long calculateTotalPaid(List<Employee> employees) {
        Long total = 0L;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    private String getMostPayingDepartment(List<Employee> employees) {
        Map<String, Long> departments = aggregateDepartments(employees);
        List<Map.Entry<String, Long>> entries = new ArrayList<>(departments.entrySet());
        Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));
        String mostPaidDepartment = entries.get(entries.size() - 1).getKey();
        return mostPaidDepartment;
    }

    private Map<String, Long> aggregateDepartments(List<Employee> employees) {
        Map<String, Long> departments = new HashMap<>();
        for (Employee employee : employees) {
            String department = employee.getDepartment();
            if (!departments.containsKey(department)) {
                departments.put(department, 0L);
            }
            Long amount = departments.get(department);
            amount += employee.getSalary();
            departments.put(department, amount);
        }
        return departments;
    }

    private Employee getMostPaidEmployee(List<Employee> employees) {
        Employee mostPaid = employees.get(0);
        for (Employee employee : employees) {
            if (earnsMore(employee, mostPaid)) {
                mostPaid = employee;
            }
        }
        return mostPaid;
    }

    private boolean earnsMore(Employee employee, Employee mostPaid) {
        return employee.getSalary().compareTo(mostPaid.getSalary()) == 1;
    }
}
