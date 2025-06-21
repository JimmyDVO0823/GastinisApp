package Managers;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class StageManager {
    private static Stage stage;
    private static final Map<String, Scene> scenes = new HashMap<>();

    public static void setStage(Stage stage) {
        StageManager.stage = stage;
    }

    public static void addScene(String name, Scene scene) {
        scenes.put(name, scene);
    }

    public static void switchScene(String name) {
        Scene scene = scenes.get(name);
        if (scene != null) {
            stage.setScene(scene);
            stage.show();
        }
        else System.out.println("Error: Scene not found: " + name);
    }
}
