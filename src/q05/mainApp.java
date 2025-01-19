package q05;

public class mainApp {
    public static void main(String[] args) {

        Account acc1 = new Account(12,null);
    Customer cust1 = new Customer("John",acc1);
    acc1.setOwner(cust1);
    // cannot create at once because of circular refarance

}

    }
