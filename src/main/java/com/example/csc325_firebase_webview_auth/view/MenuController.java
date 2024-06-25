/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.csc325_firebase_webview_auth.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import com.example.csc325_firebase_webview_auth.view.App;

/**
 * FXML Controller class
 *
 * @author kekef
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO: Add methods for showing registration and sign-in forms
    }    
    
    @FXML
    private void showRegistrationForm() throws IOException {
        App.setRoot("/files/RegistrationForm.fxml");
    }

    @FXML
    private void showSignInForm() throws IOException {
        App.setRoot("/files/SignInForm.fxml");
    }
}
