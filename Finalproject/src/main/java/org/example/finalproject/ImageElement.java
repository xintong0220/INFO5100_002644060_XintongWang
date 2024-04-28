package org.example.finalproject;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageElement implements ImageOperate { // Implements the ImageOperate interface
    protected File ImageFile; // The file representing the image
    protected ImageView view; // The view to display the image

    public ImageElement() { // Default constructor
    }

    public File getImageFile() { // Get the image file
        return ImageFile;
    }

    public ImageView getView() { // Get the view
        return view;
    }

    public void openImage() { // Method to open image file
        FileChooser chooser  = new FileChooser();
        chooser.setTitle("Open Image");
        // File filter, the application support to open image within jpg, png, jpeg format.
        chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPG","*.jpg"),
                new FileChooser.ExtensionFilter("PNG","*.png"),
                new FileChooser.ExtensionFilter("JPEG","*.jpeg"));
        this.ImageFile = chooser.showOpenDialog(null);  // Show the file chooser dialog and get the selected image file
        System.out.println(ImageFile.getAbsolutePath());
    }

    public void showImage(GridPane gp) { // Method to display the image in a specified GridPane
        if (ImageFile!= null) {
            view = new ImageView(); // Create a new ImageView to display the image
            view.setFitHeight(100); // set thumbnail(s) of the image (100x100)
            view.setFitWidth(100);
            view.setImage(new Image("file:"+ImageFile.getAbsolutePath()));
            gp.getChildren().add(view);
        }
    }

    public void delImage(GridPane gp) { // Method to remove the image in a specified GridPane
        gp.getChildren().remove(view);
    }

    public void storageImage(GetInformation gf, GridPane gp, String s) { // Method to save image file
        try {
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Save Image");
            chooser.setInitialDirectory(new File(System.getProperty("user.home")));
            // Set default file name and extension for saving
            String defaultFileName = "untitled";
            String fileExtension = s;
            chooser.setInitialFileName(defaultFileName + "." + fileExtension);
            // Show the file save dialog and get the selected file
            File file = chooser.showSaveDialog(gp.getScene().getWindow());
            // Get the image from the ImageView
            // Image saveImage = ie.getView().getImage();
            File savingFile = gf.getInputFile();
            BufferedImage saving = ImageIO.read(savingFile);
            // Write the image to the selected file using ImageIO
            if (s == "jpg"|| s== "jpeg") { // handling with PNG image within transparent background when it is transformed to JPG/JPEG
                BufferedImage newBufferedImage = new BufferedImage(saving.getWidth(),saving.getHeight(),saving.TYPE_INT_BGR);
                newBufferedImage.createGraphics().drawImage(saving,0,0, Color.WHITE,null);
                ImageIO.write(newBufferedImage, s, file);
            }
            else {
                ImageIO.write(saving, s, file);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
