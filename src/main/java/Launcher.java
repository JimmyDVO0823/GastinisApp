
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
        // 1. Crear un FXMLLoader apuntando al recurso FXML dentro de src/main/resources
        //    Asegúrate de que el archivo esté en: src/main/resources/view/MainView.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/LoginView.fxml"));

        // 2. Cargar la interfaz declarada en el FXML y obtener el nodo raíz
        Parent root = loader.load();

        // 3. (Opcional) Obtener el controlador asociado al FXML para pasarle datos o inicializar lógica
        //    MainController controller = loader.getController();
        //    controller.initData(algo);

        // 4. Crear la escena, pasando el nodo raíz y definiendo tamaño inicial (opcional)
        Scene scene = new Scene(root);

        // 5. Asignar un título a la ventana principal
        primaryStage.setTitle("Log in");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images/mercado.png")));

        // 6. Establecer la escena en el Stage
        primaryStage.setScene(scene);

        // 7. Mostrar la ventana en pantalla
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
