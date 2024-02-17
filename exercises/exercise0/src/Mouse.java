public class Mouse {
    private String brand;
    private boolean isChargeable;
    private boolean hasBluetoothConnection;
    private float length;
    private float weight;
    private String material;
    private String color;
    private String id;

    public Mouse(String brand, boolean isChargeable, boolean hasBluetoothConnection, float length, float weight, String material, String color, String id) {
        this.brand = brand;
        this.isChargeable = isChargeable;
        this.hasBluetoothConnection = hasBluetoothConnection;
        this.length = length;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.id = id;
        System.out.println("This mouse is called: " + id);
    }

    public void clickLeftButton() {
        System.out.println("People can click left button.");
    }

    public void clickRightButton() {
        System.out.println("People can click right button.");
    }

    public void scrollMouseWheel() {
        System.out.println("People can scroll mouse wheel.");
    }
}
