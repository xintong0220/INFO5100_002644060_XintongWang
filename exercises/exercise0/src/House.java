public class House {
    private String color;
    private int numberOfDoor;
    private int numberOfWindow;
    private float price;
    private float area;
    private String address;
    private boolean hasGarden;
    private String id;

    public House(String color, int numberOfDoor, int numberOfWindow, float price, float area, String address, boolean hasGarden, String id) {
        this.color = color;
        this.numberOfDoor = numberOfDoor;
        this.numberOfWindow = numberOfWindow;
        this.price = price;
        this.area = area;
        this.address = address;
        this.hasGarden = hasGarden;
        this.id = id;
        System.out.println("This house is called: " + id);
    }

    public void openDoor() {
        System.out.println("People can open door of house.");
    }

    public void closeDoor() {
        System.out.println("People can close door of house.");
    }

    public void buyHouse() {
        System.out.println("People can buy house.");
    }

    //nested class of bedroom
    public class Bedroom {
        private int numberOfBed;
        private boolean hasWindow;
        private boolean hasCloset;
        private String floorType;
        private String colorOfWall;
        private int numberOfLamp;
        private boolean hasCurtain;
        private String name;

        public Bedroom(int numberOfBed, boolean hasWindow, boolean hasCloset, String floorType, String colorOfWall, int numberOfLamp, boolean hasCurtain, String name) {
            this.numberOfBed = numberOfBed;
            this.hasWindow = hasWindow;
            this.hasCloset = hasCloset;
            this.floorType = floorType;
            this.colorOfWall = colorOfWall;
            this.numberOfLamp = numberOfLamp;
            this.hasCurtain = hasCurtain;
            this.name = name;
            System.out.println("This bedroom is called: " + name);
        }

        public void sleepInBedroom() {
            System.out.println("People can sleep in bedroom.");
        }

        public void makeBed() {
            System.out.println("People can make bed in bedroom.");
        }

        public void changeClothes() {
            System.out.println("People can change clothes in bedroom.");
        }
    }

    //nested class of bathroom
    public class Bathroom {
        private int numberOfTap;
        private int numberOfToilet;
        private boolean hasBathtub;
        private boolean hasTowel;
        private boolean hasBathCurtain;
        private String floorType;
        private String colorOfWall;
        private String name;

        public Bathroom(int numberOfTap, int numberOfToilet, boolean hasBathtub, boolean hasTowel, boolean hasBathCurtain, String floorType, String colorOfWall, String name) {
            this.numberOfTap = numberOfTap;
            this.numberOfToilet = numberOfToilet;
            this.hasBathtub = hasBathtub;
            this.hasTowel = hasTowel;
            this.hasBathCurtain = hasBathCurtain;
            this.floorType = floorType;
            this.colorOfWall = colorOfWall;
            this.name = name;
            System.out.println("This bathroom is called: " + name);
        }

        public void takeShower() {
            System.out.println("People can take shower in bathroom.");
        }

        public void washHand() {
            System.out.println("People can wash hand in bathroom.");
        }

        public void useToilet() {
            System.out.println("People can use toilet in bathroom.");
        }
    }
}
