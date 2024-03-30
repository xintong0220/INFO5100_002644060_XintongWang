import java.io.Serializable;
public abstract class Shape implements Serializable{
    public static String color;

    public abstract int calculateArea();
    public abstract int calculatePerimeter();
}
