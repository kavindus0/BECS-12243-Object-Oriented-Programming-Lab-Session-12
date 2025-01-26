// Employee.java
package Q02;
public abstract class Employee {
    public String name;
    public double age;
    public double hourRate;

    public abstract double salary(double hours);

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age + ", hourRate = " + hourRate;
    }
}
