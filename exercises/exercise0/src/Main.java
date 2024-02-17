public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(25.3f, "Trek", "aluminum", "red", 15, true, false, "bicycle1");
        Bicycle bicycle2 = new Bicycle(27.9f, "Kona", "aluminum", "blue", 24, true, false, "bicycle2");
        Bicycle bicycle3 = new Bicycle(31.1f, "Fuji", "aluminum", "yellow", 12, false, true, "bicycle3");

        Book book1 = new Book("Harry Potter1", "JK Rowling", 1050,31.2f, "English", "Raincoast Books", "red", "book1");
        Book book2 = new Book("Harry Potter2", "JK Rowling", 1738,32.7f, "English", "Raincoast Books", "red", "book2");
        Book book3 = new Book("Harry Potter3", "JK Rowling", 2077, 29.8f, "English", "Raincoast Books", "red", "book3");

        Car car1 = new Car(2020, "Corolla", "Toyota", "white", 60, "compact", true, "car1");
        Car car2 = new Car(2019, "Corolla", "Toyota", "black", 75, "compact", false, "car2");
        Car car3 = new Car(2021, "Corolla", "Toyota", "gray", 68, "compact", true, "car3");

        Cellphone cellphone1 = new Cellphone("iphone15", "white", "Apple", 5.8f, 799, true, true, "cellphone1");
        Cellphone cellphone2 = new Cellphone("iphone15", "black", "Apple", 5.8f, 799, true, true, "cellphone2");
        Cellphone cellphone3 = new Cellphone("iphone15", "gray", "Apple", 5.8f, 799, false, true, "cellphone3");

        Chair chair1 = new Chair("black", true, 4, 30.2f, 20.5f, "plastic", "Prather", "chair1");
        Chair chair2 = new Chair("blue", true, 3, 25.7f, 18.8f, "wood", "Prather", "chair2");
        Chair chair3 = new Chair("green", false, 4, 28.4f, 33.1f, "aluminum", "Prather", "chair3");

        Computer computer1 = new Computer("MacBook Air M2", 1499, "Apple", "gray", "16G", true, 3.3f, "computer1");
        Computer computer2 = new Computer("MacBook Air M2", 1499, "Apple", "dark gray", "32G", true, 3.3f, "computer2");
        Computer computer3 = new Computer("MacBook Air M2", 1499, "Apple", "Gray", "64G", false, 3.3f, "computer3");

        Desk desk1 = new Desk("white", 29.1f, 19.7f, 40.3f, 26.2f, "wood", "Tunnis", "Desk1");
        Desk desk2 = new Desk("yellow", 28.9f, 21.4f, 43.5f, 28.5f, "wood", "Tunnis", "Desk2");
        Desk desk3 = new Desk("brown", 29.4f, 23.9f, 38.6f, 19.5f, "wood", "Tunnis", "Desk3");

        Mouse mouse1 = new Mouse("Apple", true, true, 1.54f, 0.17f, "metal", "white", "mouse1");
        Mouse mouse2 = new Mouse("Apple", false, true, 2.06f, 0.23f, "metal", "gray", "mouse2");
        Mouse mouse3 = new Mouse("Apple", true, false, 1.82f, 0.15f, "metal", "white", "mouse3");

        Television television1 = new Television("black", 1599, "Samsung", "S90C", 65, true, 14, "television1");
        Television television2 = new Television("gray", 1799, "Samsung", "S89C", 77, false, 21, "television2");
        Television television3 = new Television("black", 1699, "Samsung", "QN90C", 65, true, 17, "television3");

        House house1 = new House("white", 2, 6, 110.5f, 104.7f, "620 N 6th St", true, "house1");
        House house2 = new House("brown", 1, 4, 90.4f, 85.8f, "620 N 7th St", false, "house2");
        House house3 = new House("gray", 3, 8, 138.5f, 130.5f, "620 N 8th St", true, "house3");

        House.Bedroom bedroom1 = house1.new Bedroom(1, true, true, "wood", "white", 2, true, "bedroom1");
        House.Bedroom bedroom2 = house2.new Bedroom(2, true, false, "wood", "pink", 1, true, "bedroom2");
        House.Bedroom bedroom3 = house3.new Bedroom(1, false, true, "wood", "white", 2, false, "bedroom3");

        House.Bathroom bathroom1 = house1.new Bathroom(1, 1, true, true, true, "tile", "white", "bathroom1");
        House.Bathroom bathroom2 = house2.new Bathroom(1, 1, true, false, false, "tile", "blue", "bathroom2");
        House.Bathroom bathroom3 = house3.new Bathroom(2, 2, true, true, true, "tile", "gray", "bathroom3");
    }
}
