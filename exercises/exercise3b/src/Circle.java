public class Circle extends Shape {
    public static String color = "Black";
    private static final long serialVersionUID = 1L;

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (Math.PI * radius * 2);
    }
}
