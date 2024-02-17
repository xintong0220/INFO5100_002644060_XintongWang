public class Chair {
    private String color;
    private boolean hasArmrest;
    private int legCount;
    private float length;
    private float weight;
    private String material;
    private String brand;
    private String id;

    public Chair(String color, boolean hasArmrest, int legCount, float length, float weight, String material, String brand, String id) {
        this.color = color;
        this.hasArmrest = hasArmrest;
        this.legCount = legCount;
        this.length = length;
        this.weight = weight;
        this.material = material;
        this.brand = brand;
        this.id = id;
        System.out.println("This chair is called: " + id);
    }

    public void moveChair() {
        System.out.println("Chair can be moved.");
    }

    public void sitOnChair() {
        System.out.println("People can sit on chair.");
    }

    public void sleepOnChair() {
        System.out.println("People can sleep on chair.");
    }
}
