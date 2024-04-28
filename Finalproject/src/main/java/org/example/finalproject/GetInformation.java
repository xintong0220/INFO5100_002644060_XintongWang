package org.example.finalproject;

import javafx.scene.text.Text;
import javax.imageio.ImageIO;

public class GetInformation extends FormatChange {
    int width; // image width
    int heigth; // image height

    public GetInformation(ImageElement ie) {
        imageElement = ie; // Set the ImageElement object
        inputFile = ie.getImageFile(); // Get the image file
        try {
            inputImage = ImageIO.read(inputFile); // Read the image file
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getwidth() { // get image width
        width = inputImage.getWidth();
        return width;
    }

    public int getHeight() { // get image height
        heigth = inputImage.getHeight();
        return heigth;
    }

//    This method used for testing
//    public void printInformation() {
//       System.out.println("Width: " + width + " pixels");
//       System.out.println("Height: " + heigth + " pixels");
//       System.out.println("Original Format: " + getFormat());
//    }

    public void setInformation(ImageElement ie,Text t1, Text t2, Text t3,Text t4) { // show image information in the text area.
        t1.setText("Location: "+ ie.getImageFile().toString()); // present image location
        t2.setText("Width: "+ String.valueOf(getwidth())+" pixels"); // present image width
        t3.setText("Height: " + String.valueOf(getHeight())+"pixels"); // present image height
        t4.setText("Format: "+ getFormat()); // present image format
    }
}
