package Q02;

public class Clerk extends Employee {
    // Constructor
    public Clerk(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    // Salary calculation for Clerk (hours * hourRate)
    @Override
    public double salary(double hours) {
        return hourRate * hours;
    }
}
