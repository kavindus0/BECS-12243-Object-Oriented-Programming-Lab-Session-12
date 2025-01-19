package SLIIT_2019;

public class Dhal extends Item{
    private double qtylnKilos;
     @Override
    String displayltem() {
        return "Dhal";
    }

    public Dhal(double qtylnKilos) {
        this.qtylnKilos = qtylnKilos;
    }

    @Override
    double getCost() {
        return 750;
    }

    @Override
    double getQuantity() {
        return this.qtylnKilos;
    }
}
