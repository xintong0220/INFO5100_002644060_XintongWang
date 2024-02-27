public class Rectangle extends Shape {
    public static String color = "Blue";

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public int calculatePerimeter() {
        return (length + width) * 2;
    }
}
