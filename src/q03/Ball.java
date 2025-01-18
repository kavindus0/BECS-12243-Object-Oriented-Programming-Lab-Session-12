package q03;

public abstract class Ball implements Tossable {


    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }
public String getBrandName() {
        return brandName;
    }

    abstract void bounce();


}
