package controllers; /**
 * Sample Skeleton for 'LoginView.fxml' Controller Class
 */

import Facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
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
        String user = txtUser.getText();
        String pass = txtPassword.getText();
        facade.logIn(user, pass);
    }

    @FXML
    void lostPassword(ActionEvent event) {

    }

    @FXML
    void signIn(ActionEvent event) throws Exception {
        startSignInView();
    }

    public void startSignInView() throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/SignInView.fxml"));


            // 2. Cargar la interfaz declarada en el FXML y obtener el nodo raíz
            Parent root = loader.load();
            Stage stage = new Stage();
            // 3. (Opcional) Obtener el controlador asociado al FXML para pasarle datos o inicializar lógica
            //    MainController controller = loader.getController();
            //    controller.initData(algo);

            // 4. Crear la escena, pasando el nodo raíz y definiendo tamaño inicial (opcional)
            Scene scene = new Scene(root);

            // 5. Asignar un título a la ventana principal
            stage.setTitle("Log in");
            //stage.getIcons().add(new Image(getClass().getResourceAsStream("images/mercado.png")));

            // 6. Establecer la escena en el Stage
            stage.setScene(scene);

            // 7. Mostrar la ventana en pantalla
            stage.show();

            SignInController.setStage(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
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
