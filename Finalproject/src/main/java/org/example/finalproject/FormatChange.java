package org.example.finalproject;

import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.control.ChoiceBox;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class FormatChange {
    protected ImageElement imageElement; // Instance of ImageElement class
    protected File inputFile; // Input image file
    protected BufferedImage inputImage; // Input image
    protected File outputFile; // Output image file

    public FormatChange() { // Default constructor
    }

    public File getInputFile() {
        return inputFile;
    }

    public String getFormat() { // get initial format of the image uploaded by user
        String fileName = inputFile.getName(); //gain the name of the image file.
        int formatIndex = fileName.lastIndexOf(".");
        if (formatIndex != -1 && formatIndex < fileName.length() - 1) { // gain the format information of the image from its file name.
            String imageFormat = fileName.substring(formatIndex + 1).toUpperCase();
            return imageFormat;
        }
        return "Unknown"; // Return "Unknown" if format cannot be determined
    }

//    The below method used for testing
//    public File changeImageFormat(String s) { // Method to change the format of the image
//        try {
//            ImageIO.write(inputImage, s, outputFile); // Write the image with the new format
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        return outputFile; // Return the output file
//    }
}
