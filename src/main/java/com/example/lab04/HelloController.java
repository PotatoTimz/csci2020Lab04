package com.example.lab04;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField fullNameTextField;
    @FXML
    private TextField passwordFieldText;
    @FXML
    private TextField emailTextField;

    @FXML
    private Label printText;

    @FXML
    protected void registerButtonClick() {
         String userName = usernameTextField.getText();
         String password= fullNameTextField.getText();
         String fullName= passwordFieldText.getText();
         String email= emailTextField.getText();

         printText.setText("user: "+userName+ " password: "+password+" full name: "+fullName+" email: "+email);
    }
}