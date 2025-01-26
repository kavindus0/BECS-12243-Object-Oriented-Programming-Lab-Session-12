package Q02;

// Manager Class
public class Manager extends Employee {
    // Constructor
    public Manager(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    // Salary calculation for Manager (hours * hourRate)
    @Override
    public double salary(double hours) {
        return hourRate * hours;
    }
}

// Clerk Class