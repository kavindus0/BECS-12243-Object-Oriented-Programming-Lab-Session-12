package Q02;

    public class Test {
    public static void main(String[] args) {
        // Create employee objects
        Employee perera = new Manager("Perera", 54, 1000);
        Employee saman = new Clerk("Saman", 32, 600);
        Employee nimal = new Clerk("Nimal", 41, 700);
        Employee kalani = new Clerk("Kalani", 28, 800);

        // Store employees in an array
        Employee[] employees = {perera, saman, nimal, kalani};
        // Store employees in an array
        //Employee[] employees = {perera, saman, nimal, kalani};

        // Calculate total payment for one week (8 hours/day * 7 days = 56 hours)
        double totalHours = 8 * 7;
        double totalPayment = 0;

        for (Employee emp : employees) {
            totalPayment += emp.salary(totalHours);
        }

        System.out.println("Total payment: " + totalPayment);
    }
    }

