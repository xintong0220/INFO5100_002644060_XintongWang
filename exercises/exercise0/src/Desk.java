public class Desk {
    private String color;
    private float height;
    private float width;
    private float length;
    private float weight;
    private String material;
    private String brand;
    private String id;

    public Desk(String color, float height, float width, float length, float weight, String material, String brand, String id) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.material = material;
        this.brand = brand;
        this.id = id;
        System.out.println("This desk is called: " + id);
    }

    public void moveDesk() {
        System.out.println("Desk can be moved.");
    }

    public void studyOnDesk() {
        System.out.println("People can study on desk.");
    }

    public void workOnDesk() {
        System.out.println("People can work on desk.");
    }
}
