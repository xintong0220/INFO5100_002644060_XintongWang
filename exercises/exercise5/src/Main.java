public class Main {
    public static void main(String[] args) {
        // Singleton Pattern Usage
        SessionManager sessionManager = SessionManager.getInstance();
        sessionManager.login("Bob");

        // Factory Pattern Usage
        Product clothing = ProductFactory.getProduct("clothing");
        clothing.displayInformation();
        Product electronics = ProductFactory.getProduct("electronics");
        electronics.displayInformation();
        Product toy = ProductFactory.getProduct("toy");
        toy.displayInformation();

        // Observer Pattern Usage
        Notification notification = new Notification();
        User Judy = new User("Judy");
        User Vicky = new User("Vicky");
        User Steven = new User("Steven");

        notification.addObserver(Judy);
        notification.addObserver(Vicky);
        notification.addObserver(Steven);
        notification.notifyObservers("New discount on clothing, electronic devices and toys!");

        sessionManager.logout();
    }
}