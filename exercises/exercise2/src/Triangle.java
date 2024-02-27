public class Triangle extends Shape{
    public static String color = "Yellow";

    private int base;
    private int height;
    private int sideOne;
    private int sideTwo;

    public Triangle(int base, int height, int sideOne, int sideTwo) {
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public int calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public int calculatePerimeter() {
        return base + sideOne + sideTwo;
    }
}
