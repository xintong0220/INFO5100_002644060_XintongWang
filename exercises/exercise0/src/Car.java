public class Car {
    private int year;
    private String model;
    private String manufacturer;
    private String color;
    private int speed;
    private String type;
    private boolean hasInsurance;
    private String id;

    public Car(int year, String model, String manufacturer, String color, int speed, String type, boolean hasInsurance, String id) {
        this.year = year;
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.speed = speed;
        this.type = type;
        this.hasInsurance = hasInsurance;
        this.id = id;
        System.out.println("This car is called: " + id);
    }

    public void turnRight() {
        System.out.println("Car is turning right.");
    }

    public void turnLeft() {
        System.out.println("Car is turning left.");
    }

    public void goStraight() {
        System.out.println("Car is going straight.");
    }
}
