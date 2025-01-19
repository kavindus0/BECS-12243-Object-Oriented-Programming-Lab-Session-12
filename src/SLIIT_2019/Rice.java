package SLIIT_2019;

public class Rice extends Item{
        private double qtylnKilos;


    @Override
    String displayltem() {
        return "Rice";
    }
    @Override
    double getCost() {
        return 1000;
    }

    public Rice(double qtylnKilos) {
        this.qtylnKilos = qtylnKilos;
    }

    @Override
    double getQuantity() {
        return this.qtylnKilos;
    }
}
