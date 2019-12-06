package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{



        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("JavaFXTestApp");
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
