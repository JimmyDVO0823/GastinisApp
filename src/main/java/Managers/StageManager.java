package Managers;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class StageManager {
    //Se utiliza un patrón singleton para tener una sola Stage
    private static Stage stage;

    //Se hace un mapa con las escenas
    private static final Map<String, Scene> scenes = new HashMap<>();

    /**
     * Se setea la Stage —La cual es única— cuando se quiere cambiar
     * @param stage
     */
    public static void setStage(Stage stage) {
        StageManager.stage = stage;
    }

    /**
     * Para añadir escenas
     * @param name Nombre de la escena
     * @param scene escena
     */
    public static void addScene(String name, Scene scene) {
        scenes.put(name, scene);
    }

    /**
     * Para cambiar entre escenas usando el nombre
     * @param name
     */
    public static void switchScene(String name) {
        Scene scene = scenes.get(name);
        if (scene != null) {
            stage.setScene(scene);
            stage.show();
        }
        else System.out.println("Error: Scene not found: " + name);
    }
}
