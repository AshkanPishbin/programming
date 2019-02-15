package reflection.week7.prepared;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private FileReader reader = new FileReader();

    public List<Employee> getEmployees() {
        List<String> lines = reader.asLines("reflection/week7/employees.csv");
        removeHeader(lines);
        return toEmployees(lines);
    }

    private void removeHeader(List<String> lines) {
        lines.remove(0);
    }

    private List<Employee> toEmployees(List<String> lines) {
        List<Employee> employees = new ArrayList<>();
        for (String line : lines) {
            employees.add(toEmployee(line));
        }
        return employees;
    }

    private Employee toEmployee(String line) {
        String[] columns = line.split(";");
        return new Employee(
                columns[0],
                columns[1],
                Integer.valueOf(columns[2]),
                columns[3]
        );
    }
}
