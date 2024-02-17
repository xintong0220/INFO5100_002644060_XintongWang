public class Computer {
    private String model;
    private int price;
    private String brand;
    private String color;
    private String memorySize;
    private boolean isOn;
    private float weight;
    private String id;

    public Computer(String model, int price, String brand, String color, String memorySize, boolean isOn, float weight, String id) {
        this.model = model;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.memorySize = memorySize;
        this.isOn = isOn;
        this.weight = weight;
        this.id = id;
        System.out.println("This computer is called: " + id);
    }

    public void turnOnComputer() {
        System.out.println("People can turn on computer.");
    }

    public void turnOffComputer() {
        System.out.println("People can turn off computer.");
    }

    public void playComputerGame() {
        System.out.println("People can play game on computer.");
    }
}
