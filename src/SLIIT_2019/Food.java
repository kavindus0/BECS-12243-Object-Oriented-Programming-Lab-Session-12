package SLIIT_2019;

import java.util.ArrayList;

public class Food implements IAccountable{

    private Item[] items;
    double sum = 0;

    ArrayList<Double> pricesList = new ArrayList<Double>();
    public Food(Item[] o) {

        this.items = o;

    }

    @Override
    public void calculateCost() {

        System.out.println("Calculating cost of food");

        for (Item item:this.items){

            if (item.getClass() == Rice.class){

                System.out.println("Rice=> "+ item.getCost() +"*"+item.getQuantity()+ " = " +item.getQuantity()* item.getCost());

                pricesList.add(item.getQuantity()* item.getCost());

            } else if (item.getClass() == Dhal.class) {
                                System.out.println("Dhal=> "+ item.getCost() +"*"+item.getQuantity()+ " = " +item.getQuantity()* item.getCost());
                                                pricesList.add(item.getQuantity()* item.getCost());


            } else if (item.getClass()== Soya.class) {
                                System.out.println("Soya=> "+ item.getCost() +"*"+item.getQuantity()+ " = " +item.getQuantity()* item.getCost());
                                               pricesList.add(item.getQuantity()* item.getCost());


            } else {
                System.out.println("Invalid Data");
            }



        }
               for (Double aDouble : pricesList) {
                sum += aDouble;
            }

            System.out.println("Sum is "+ sum);



    }



}
