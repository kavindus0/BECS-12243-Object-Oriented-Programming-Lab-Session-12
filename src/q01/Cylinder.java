package q01;

public class Cylinder extends Circle{

private double height = 1.0;



    public Cylinder() {}

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder( double radius, double height,String color) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //getvikl

    @Override
public String toString(){
        return "Cylinder[radius=r, height=h, color=c]";
    }
}
