package org.example.finalproject;

import javafx.scene.layout.GridPane;
import java.io.File;

public interface ImageOperate { // ImageOperate is the inference of ImageElement Class.
    public void openImage();
    public void delImage(GridPane gp);
    public void showImage(GridPane gp);
    public void storageImage(GetInformation gf, GridPane gp, String s);
}
