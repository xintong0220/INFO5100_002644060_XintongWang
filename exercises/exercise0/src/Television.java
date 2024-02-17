public class Television {
    private String color;
    private int price;
    private String brand;
    private String model ;
    private int screenSize;
    private boolean isOn;
    private int volume;
    private String id;

    public Television(String color, int price, String brand, String model, int screenSize, boolean isOn, int volume, String id) {
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.isOn = isOn;
        this.volume = volume;
        this.id = id;
        System.out.println("This television is called: " + id);
    }

    public void turnOnTelevision() {
        System.out.println("People can turn on television.");
    }

    public void turnOffTelevision() {
        System.out.println("People can turn off television.");
    }

    public void changeChannel() {
        System.out.println("People can change channel on television.");
    }
}
