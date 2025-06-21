/**
 * Sample Skeleton for 'SignInView.fxml' Controller Class
 */

package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Facade.Facade;
import Managers.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignInController {
    private Facade facade;
    private static Stage stage;

    public SignInController() {
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

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private TextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUser"
    private TextField txtUser; // Value injected by FXMLLoader

    @FXML
    void back(ActionEvent event) {
        StageManager.switchScene("MainMenu");
    }

    @FXML
    void signIn(ActionEvent event) {
        String username = txtUser.getText();
        String email = txtEmail.getText();
        String pass = txtPassword.getText();
        facade.registerUser(email,username,pass);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmdBack != null : "fx:id=\"cmdBack\" was not injected: check your FXML file 'SignInView.fxml'.";
        assert cmdLogin != null : "fx:id=\"cmdLogin\" was not injected: check your FXML file 'SignInView.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'SignInView.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'SignInView.fxml'.";
        assert txtUser != null : "fx:id=\"txtUser\" was not injected: check your FXML file 'SignInView.fxml'.";

    }

    //GETTERS SETTERS


    public Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        SignInController.stage = stage;
    }
}
