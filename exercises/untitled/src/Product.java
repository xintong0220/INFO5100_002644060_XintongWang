//Factory Design Pattern
interface Product {
    void displayInformation();
}

class Clothing implements Product {
    @Override
    public void displayInformation() {
        System.out.println("The store offers clothing.");
    }
}

class Electronics implements Product {
    @Override
    public void displayInformation() {
        System.out.println("The store offers electronic devices.");
    }
}

class Toy implements Product {
    @Override
    public void displayInformation() {
        System.out.println("The store offers toys.");
    }
}

class ProductFactory {
    public static Product getProduct(String type) {
        switch (type) {
            case "clothing":
                return new Clothing();
            case "electronics":
                return new Electronics();
            case "toy":
                return new Toy();
            default:
                throw new IllegalArgumentException("Unknown product type.");
        }
    }
}
