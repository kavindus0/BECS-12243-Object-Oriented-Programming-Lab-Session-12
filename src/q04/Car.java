package q04;

public class Car implements IVehicle {
int mileage;
int year;
int numDoors;
// constructor goes here
// indicate whether car was built before given year
boolean builtBefore(int otherYear) {
return this.year < otherYear;
}

    @Override
    public double tuneUpCost() {
        return 0;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        return false;
    }
}

