package Arm.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


public class MainController {

    @FXML
    private ComboBox<String> objComboBox = new ComboBox<String>();

    @FXML
    private ComboBox<String> subdivisionComboBox = new ComboBox<String>();

    @FXML
    private ComboBox<String> fullNameComboBox = new ComboBox<String>();

    @FXML
    private Button loginBtn;

    @FXML
    private void loginButtonHandler(Event event) {
        System.out.println("liginButtonPressed");
        loginBtn.setText("You've clicked!");
    }

    public void initData() {
        ObservableList<String> availableChoices1 = FXCollections.observableArrayList("test1", "test2", "test3");
        objComboBox.setItems(availableChoices1);

        ObservableList<String> availableChoices2 = FXCollections.observableArrayList("test1", "test2", "test3");
        subdivisionComboBox.setItems(availableChoices2);

        ObservableList<String> availableChoices3 = FXCollections.observableArrayList("test1", "test2", "test3");
        fullNameComboBox.setItems(availableChoices3);
    }

}
