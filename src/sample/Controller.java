package sample;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;


public class Controller {

    @FXML
    private ChoiceBox<String> chBox1 = new ChoiceBox<String>(FXCollections.observableArrayList(new String[]{"test1", "test2", "test3"}));

    @FXML
    private void loginButtonHandler(Event event) {
        System.out.println("liginButtonPressed");
    }

}
