public class Bicycle {
    private float weight;
    private String brand;
    private String material;
    private String color;
    private int speed;
    private boolean isElectric;
    private boolean isLocked;
    private String id;

    public Bicycle(float weight, String brand, String material, String color, int speed, boolean isElectric, boolean isLocked, String id) {
        this.weight = weight;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.speed = speed;
        this.isElectric = isElectric;
        this.isLocked = isLocked;
        this.id = id;
        System.out.println("This bicycle is called: " + id);
    }

    public void lock() {
        System.out.println("Bicycle can be locked.");
    }

    public void unlock() {
        System.out.println("Bicycle can be unlocked.");
    }

    public void makeTurn() {
        System.out.println("Bicycle can make turn.");
    }
}
