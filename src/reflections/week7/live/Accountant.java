package reflections.week7.live;

import java.util.List;

public class Accountant {

    private WorkerReader workerReader = new WorkerReader();
    private Treasury treasury = new Treasury();
    private DataScientist scientist = new DataScientist();

    public Data pay() {
        List<Worker> workers = workerReader.getWorkers();
        transferMoney(workers);
        return scientist.getData(workers);
    }

    private void transferMoney(List<Worker> workers) {
        for (Worker worker : workers) {
            Integer amount = worker.getSalary();
            String account = worker.getAccount();
            treasury.transfer(amount, account);
        }
    }


}
