package views;

import Managers.StageManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Launcher extends Application {
    /**
     * Punto de entrada de JavaFX.
     * @param primaryStage ventana principal de la aplicación
     * @throws Exception si ocurre un error al cargar el FXML
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Setero al stageManager
        primaryStage.setFullScreen(true);
        StageManager.setStage(primaryStage);


        //seteamos una imagen
        Image icon = new Image(getClass().getResourceAsStream("/images/mercado.png"));

        // 1. Crear un FXMLLoader apuntando al recurso FXML dentro de src/main/resources
        FXMLLoader mainMenuLoader = new FXMLLoader(getClass().getResource("/views/MainMenu.fxml"));
        FXMLLoader LoginLoader = new FXMLLoader(getClass().getResource("/views/LoginView.fxml"));
        FXMLLoader SignInLoader = new FXMLLoader(getClass().getResource("/views/SignInView.fxml"));
        FXMLLoader VocabularyLoader = new FXMLLoader(getClass().getResource("/views/Vocabulary.fxml"));


        //Creamos las escenas
        Scene mainMenuScene = new Scene(mainMenuLoader.load());
        Scene LoginScene = new Scene(LoginLoader.load());
        Scene SignInScene = new Scene(SignInLoader.load());
        Scene OperationsScene = new Scene(VocabularyLoader.load());

        // 5. Asignar un título a la ventana principal
        primaryStage.setTitle("Menú de Inicio");
        primaryStage.getIcons().add(icon);

        //Aniadimos los objetos scene al manager
        StageManager.addScene("MainMenu",mainMenuScene);
        StageManager.addScene("LogIn",LoginScene);
        StageManager.addScene("SignIn",SignInScene);
        StageManager.addScene("Operations",OperationsScene);

        // 6. Establecer la escena en el Stage
        primaryStage.setScene(mainMenuScene);

        // 7. Aplciar estiulos

        // 8. Mostrar la ventana en pantalla
        primaryStage.show();
    }

    /**
     * Método main que lanza la aplicación JavaFX.
     * launch() internamente inicializa el toolkit y llama a start().
     */
    public static void main(String[] args) {
        launch(args);
    }

}
