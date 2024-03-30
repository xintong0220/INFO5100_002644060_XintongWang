public class Square extends Shape {
    public static String color = "Gray";
    private static final long serialVersionUID = 1L;

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }
}
