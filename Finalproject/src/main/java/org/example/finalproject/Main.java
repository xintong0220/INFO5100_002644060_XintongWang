package org.example.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Image Managemnt Tool"); // set the title of the GUI.
        primaryStage.setResizable(false); // user can not change the size of application window.
        Parent root = FXMLLoader.load(getClass().getResource("ImageMangementUI.fxml")); // connect the stage with fxml document.
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}