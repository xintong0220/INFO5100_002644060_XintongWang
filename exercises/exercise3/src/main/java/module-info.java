module org.example.exercise3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.exercise3 to javafx.fxml;
    exports org.example.exercise3;
}