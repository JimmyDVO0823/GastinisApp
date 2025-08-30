/**
 * Sample Skeleton for 'Vocabulary.fxml' Controller Class
 */

package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VocabularyController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cmdGoBooks"
    private Button cmdGoBooks; // Value injected by FXMLLoader

    @FXML // fx:id="cmdGoWords"
    private Button cmdGoWords; // Value injected by FXMLLoader

    @FXML
    void goBooks(ActionEvent event) {

    }

    @FXML
    void goWords(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmdGoBooks != null : "fx:id=\"cmdGoBooks\" was not injected: check your FXML file 'Vocabulary.fxml'.";
        assert cmdGoWords != null : "fx:id=\"cmdGoWords\" was not injected: check your FXML file 'Vocabulary.fxml'.";

    }

}
