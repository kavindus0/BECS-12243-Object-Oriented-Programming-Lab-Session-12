package q05;

public class Account {
    int number;

    public void setOwner(Customer customer) {
        this.owner = customer;
    }

    Customer owner;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    Account(int number, Customer owner) {
        this.number = number;
        this.owner = owner;
        this.balance = 0;
    }
}

