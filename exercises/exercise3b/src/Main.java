import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void serializeObject(Object object, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(object);

            out.close();
            fileOut.close();

            System.out.println(object.getClass().getSimpleName() + " has been serialized");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserializeObject(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object object = in.readObject();

            in.close();
            fileIn.close();

            System.out.println(object.getClass().getSimpleName() + " has been deserialized");
            return object;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle(3,4,4,5);
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(3,4);
        Shape circle = new Circle(3);

        serializeObject(triangle,"triangle.ser");
        serializeObject(square,"square.ser");
        serializeObject(rectangle,"rectangle.ser");
        serializeObject(circle,"circle.ser");

        Triangle deserializedTriangle = (Triangle) deserializeObject("triangle.ser");
        Square deserializedSquare = (Square) deserializeObject("square.ser");
        Rectangle deserializedRectangle = (Rectangle) deserializeObject("rectangle.ser");
        Circle deserializedCircle = (Circle) deserializeObject("circle.ser");
    }
}