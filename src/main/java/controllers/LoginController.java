package controllers; /**
 * Sample Skeleton for 'LoginView.fxml' Controller Class
 */

import Facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {
    private Facade facade;
    public LoginController() {
        facade = Facade.getInstance();
    }

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cmdBack"
    private Button cmdBack; // Value injected by FXMLLoader

    @FXML // fx:id="cmdLogin"
    private Button cmdLogin; // Value injected by FXMLLoader

    @FXML // fx:id="cmdLostPassword"
    private Hyperlink cmdLostPassword; // Value injected by FXMLLoader

    @FXML // fx:id="cmdSignIn"
    private Hyperlink cmdSignIn; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private TextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUser"
    private TextField txtUser; // Value injected by FXMLLoader

    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void logIn(ActionEvent event) {
        facade.registrarUsuario();
    }

    @FXML
    void lostPassword(ActionEvent event) {

    }

    @FXML
    void signIn(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmdBack != null : "fx:id=\"cmdBack\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert cmdLogin != null : "fx:id=\"cmdLogin\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert cmdLostPassword != null : "fx:id=\"cmdLostPassword\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert cmdSignIn != null : "fx:id=\"cmdSignIn\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert txtUser != null : "fx:id=\"txtUser\" was not injected: check your FXML file 'LoginView.fxml'.";

    }

}
