module org.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens org.example.finalproject to javafx.fxml;
    exports org.example.finalproject;
}