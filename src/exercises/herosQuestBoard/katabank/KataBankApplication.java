package challenge.katabank;

import java.util.List;

public class KataBankApplication {

    public static void main(String[] args) {
        AccountReader reader = new AccountReader();
        List<Account> accounts = reader.read("challenge/katabank/accounts.csv");
        accounts.forEach(System.out::println);
    }

}
