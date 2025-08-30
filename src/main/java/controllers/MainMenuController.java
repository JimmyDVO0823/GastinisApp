package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Managers.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cmdDiccionario;

    @FXML
    private Button cmdLogIn;

    @FXML
    private Button cmdSignIn;

    @FXML
    private ImageView imgUserLogo;

    @FXML
    private Label lblUsername;

    @FXML
    private VBox vbox;

    @FXML
    void goDictionary(ActionEvent event) {

    }

    @FXML
    void logIn(ActionEvent event) {
        StageManager.switchScene("LogIn");
    }

    @FXML
    void signIn(ActionEvent event) {
        StageManager.switchScene("SignIn");
    }

    @FXML
    void initialize() {
        assert cmdDiccionario != null : "fx:id=\"cmdDiccionario\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert cmdLogIn != null : "fx:id=\"cmdLogIn\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert cmdSignIn != null : "fx:id=\"cmdSignIn\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert imgUserLogo != null : "fx:id=\"imgUserLogo\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert vbox != null : "fx:id=\"vbox\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }

}

//
//
