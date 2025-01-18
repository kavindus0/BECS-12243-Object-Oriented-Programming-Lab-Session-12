package q04;

public class Bicycle implements IVehicle {
int mileage;
int numGears;

    @Override
    public double tuneUpCost() {
        return 0;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        return false;
    }

// constructor goes here
}

