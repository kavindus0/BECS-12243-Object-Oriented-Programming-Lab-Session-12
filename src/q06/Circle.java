package q06;

public class Circle extends Shape{
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void fitText(String n) {
        if (n.length() > this.radius) {
            System.out.println("Text too long");
        } else {
            System.out.println("Text fits");
        }
    }

}
