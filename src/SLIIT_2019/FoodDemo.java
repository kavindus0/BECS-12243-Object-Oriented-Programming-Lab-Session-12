package SLIIT_2019;

public class FoodDemo {

public static void main(String[] args) {

Item [] items = new Item[]{new Rice(5),new Dhal(3),
        new Soya(4),new Rice(4),new Soya(4)};

Food food= new Food(items);

food.calculateCost();
}

}
