package SLIIT_2019;

public class Soya extends Item{
        private double qtylnKilos;

    public Soya(double qtylnKilos) {
        this.qtylnKilos = qtylnKilos;
    }

        @Override
    String displayltem() {
        return "Soya";
    }
    @Override
    double getCost() {
        return 850;
    }

    @Override
    double getQuantity() {
        return this.qtylnKilos;
    }
}
