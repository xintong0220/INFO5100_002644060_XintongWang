public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(3,4,4,5);
        Shape shape2 = new Square(5);
        Shape shape3 = new Rectangle(3,4);
        Shape shape4 = new Circle(3);

        System.out.println("Area and Perimeter of Triangle : " + shape1.calculateArea() + "; " + shape1.calculatePerimeter());
        System.out.println("Area and Perimeter of Square : " + shape2.calculateArea() + "; " + shape2.calculatePerimeter());
        System.out.println("Area and Perimeter of Rectangle : " + shape3.calculateArea() + "; " + shape3.calculatePerimeter());
        System.out.println("Area and Perimeter of Circle : " + shape4.calculateArea() + "; " + shape4.calculatePerimeter());
    }
}