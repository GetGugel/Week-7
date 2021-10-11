package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML Label Mylabel;
    
    
    @FXML
    private Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void rspndToBtn1() throws IOException {
        System.out.println("Hello");
    }
    @FXML
    private void rspndToBtn2() throws IOException {
        System.out.println("Brett");
    }
    @FXML
    private void showMyName() throws IOException {
       Mylabel.setText("Brett");
        
    }
}
