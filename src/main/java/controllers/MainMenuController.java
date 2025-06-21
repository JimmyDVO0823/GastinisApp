/**
 * Sample Skeleton for 'MainMenu.fxml' Controller Class
 */

package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Managers.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cmdLogIn"
    private Button cmdLogIn; // Value injected by FXMLLoader

    @FXML // fx:id="cmdOperations"
    private Button cmdOperations; // Value injected by FXMLLoader

    @FXML // fx:id="cmdSignIn"
    private Button cmdSignIn; // Value injected by FXMLLoader

    @FXML // fx:id="imgUserLogo"
    private ImageView imgUserLogo; // Value injected by FXMLLoader

    @FXML // fx:id="menuUser"
    private MenuButton menuUser; // Value injected by FXMLLoader

    @FXML
    void goOperationMenu(ActionEvent event) {

    }

    @FXML
    void logIn(ActionEvent event) {
        StageManager.switchScene("LogIn");
    }


    @FXML
    void signIn(ActionEvent event) {
        StageManager.switchScene("SignIn");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmdLogIn != null : "fx:id=\"cmdLogIn\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert cmdOperations != null : "fx:id=\"cmdOperations\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert cmdSignIn != null : "fx:id=\"cmdSignIn\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert imgUserLogo != null : "fx:id=\"imgUserLogo\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert menuUser != null : "fx:id=\"menuUser\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }

}
