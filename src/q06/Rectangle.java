package q06;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void fitText(String n) {
        if (n.length() > this.length) {
            System.out.println("Text too long");
        } else {
            System.out.println("Text fits");
        }
    }
}
