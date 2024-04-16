// Singleton Design Pattern
public class SessionManager {
    private static SessionManager instance;
    private String admin;

    private SessionManager() {}

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void login(String admin) {
        this.admin = admin;
        System.out.println("Admin " + admin + " logged into Session Manger and can send notifications to users.");
    }

    public void logout() {
        System.out.println("Admin " + admin + " logged out of Session Manager.");
        admin = null;
    }
}
