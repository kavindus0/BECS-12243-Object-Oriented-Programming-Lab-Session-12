package q05;

public class Customer {
    String name;
    private int password;
    Account account;

    Customer(String name, Account account) {

        this.name = name;

        this.account = account;

        this.password = genPassword();
}

    private int genPassword() {
        return 11223;
    }
}

