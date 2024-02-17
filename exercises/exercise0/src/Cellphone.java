public class Cellphone {
    private String model;
    private String color;
    private String brand;
    private float screenSize;
    private int price;
    private boolean isWaterproof;
    private boolean isSmartphone;
    private String id;

    public Cellphone(String model, String color, String brand, float screenSize, int price, boolean isWaterproof, boolean isSmartphone, String id) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.screenSize = screenSize;
        this.price = price;
        this.isWaterproof = isWaterproof;
        this.isSmartphone = isSmartphone;
        this.id = id;
        System.out.println("This cellphone is called: " + id);
    }

    public void sendMessage() {
        System.out.println("People can send message from cellphone.");
    }

    public void makeCall() {
        System.out.println("People can make call from cellphone.");
    }

    public void takePhoto() {
        System.out.println("People can take photo with cellphone.");
    }
}
