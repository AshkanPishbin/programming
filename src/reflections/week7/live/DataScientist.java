package reflection.week7.live;

import java.util.*;

public class DataScientist {

    public Data getData(List<Worker> workers) {
        return new Data(
                calculateTotalPaid(workers),
                getMostPayingDepartment(workers),
                findTopSalaryWorker(workers)
        );
    }

    private Integer calculateTotalPaid(List<Worker> workers) {
        Integer total = 0;
        for (Worker worker : workers) {
            total += worker.getSalary();
        }
        return total;
    }

    private String getMostPayingDepartment(List<Worker> workers) {
        Map<String, Integer> departments = new HashMap<>();
        for (Worker worker : workers) {
            String department = worker.getDepartment();
            if (!departments.containsKey(department)) {
                departments.put(department, 0);
            }
            Integer amount = departments.get(department);
            amount += worker.getSalary();
            departments.put(department, amount);
        }
        Set<Map.Entry<String, Integer>> set = departments.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);

        list.sort(Comparator.comparing(Map.Entry::getValue));
        Map.Entry<String, Integer> entry = list.get(list.size() - 1);
        String department = entry.getKey();

        return department;
    }

    private Worker findTopSalaryWorker(List<Worker> workers) {
        Worker topPaid = workers.get(0);
        for (Worker worker : workers) {
            if (earnsMore(worker, topPaid)) {
                topPaid = worker;
            }
        }
        return topPaid;
    }

    private boolean earnsMore(Worker worker, Worker topPaid) {
        Integer workerSalary = worker.getSalary();
        Integer topPaidSalary = topPaid.getSalary();
        return workerSalary > topPaidSalary;
    }
}
