package q06;

public abstract class Shape implements Sign{

    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void fitText(String n);

}
