package org.example.finalproject;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class UIcontroller {
    // FXML annotated fields
    @FXML
    private GridPane viewWindow;
    private ImageElement picture;
    @FXML
    private Text widthInformation;
    @FXML
    private Text heigthInformation;
    @FXML
    private Text formatInformation;
    @FXML
    private Text locationInformation;
    @FXML
    private ChoiceBox formatSelection;
    private GetInformation gf;
    // List for format selection in ChoiceBox
    ObservableList<String> formatSelsctionList = FXCollections.observableArrayList("png","jpg","jpeg");
    private boolean hasImage = false; // to judge whether the user has upload picture in the system or not.

    @FXML
    public void initialize() { // Initialize the Choice box.
        formatSelection.setValue("---No Select---");
        formatSelection.setItems(formatSelsctionList);
    }

    @FXML
    public void addImage( ) { // when use click "Open", he can upload image to the system.
        try {
            if (hasImage == false ) { // if no image uploaded in the system currently.
               picture = new ImageElement();
               picture.openImage(); // Open image file
               picture.showImage(viewWindow); //display image
               hasImage = true;
               //System.out.println(picture.getImageFile());
               gf = new GetInformation(picture); // Initialize GetInformation object with the loaded image
               gf.setInformation(picture,locationInformation,widthInformation,heigthInformation,formatInformation); //set imformation in UI
            }
            else { // deal with user has already uploaded an image in the system.
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Sorry you need to delete current picture first.");
                alert.show();
            }
        }
        catch (Exception e) { // deal with error while opening image.
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error occurred while opening image.");
            alert.show();
        }
    }

    @FXML
    public void deleteImage() { // The function uses to delete picture upload by users.
        try {
            if (hasImage == true) { // If an image has been uploaded in the system currently.
                picture.delImage(viewWindow); // Delete the image from the view
                // Clear image information from UI
                locationInformation.setText("");
                widthInformation.setText("");
                heigthInformation.setText("");
                formatInformation.setText("");
                hasImage = false; // Reset image loaded flag
            }
            else { // dealing with the users didn't open an image.
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Sorry, you need to open an image first.");
                alert.show();
            }
        }
        catch(Exception e) { //dealing with other error.
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error occurred while deleting image.");
            alert.show();
        }
    }

    @FXML
    public void saveImage() {
        try {
            if (hasImage == true) {  //If an image has been uploaded in the system currently.
                String targetFormat = formatSelection.getValue().toString();
                if (targetFormat == "---No Select---"){ // If no format is selected, use the original image format
                    targetFormat = gf.getFormat();
                }
                picture.storageImage(gf, viewWindow, targetFormat);  // Save the image with the selected format
            }
            else { // deal with status that user didn't upload image to the system.
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Sorry, you need to open an image first.");
                alert.show();
            }
        }
        catch(Exception e) { // deal with error while saving image.
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error occurred while saving image.");
            alert.show();
        }
    }
}
