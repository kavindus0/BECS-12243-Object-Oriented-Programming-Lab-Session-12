package q06;

public class ShapeClient {

    public static void main(String[] args) {
        Circle circle1 = new Circle( "Red",7);
        Circle circle2 = new Circle("Blue",12);

        Rectangle rectangle1 = new Rectangle("Green", 28, 12);

        circle1.fitText("Be silent");
        circle2.fitText("Study Rooms");
        rectangle1.fitText("Just 3 min walk for a snack");
    }
}
