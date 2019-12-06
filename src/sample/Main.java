package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Controller;

import java.sql.SQLException;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Class.forName("org.h2.Driver");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = (Parent) loader.load();
        Controller myController = loader.getController();
        myController.initData();
        stage.setTitle("JavaFXTestApp");
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.show();

        DbContext dbContext = new DbContext("h2","C:\\TestSpringBase\\testARM","sa","", "TEST_TABLE");
        dbContext.connectToDB();
        dbContext.createBase();
        ModelTest modelTest1 = new ModelTest("Fullname_test1","Oilfield_test1");
        ModelTest modelTest2 = new ModelTest("Fullname_test2","Oilfield_test2");
        ModelTest modelTest3 = new ModelTest("Fullname_test3","Oilfield_test3");
        dbContext.insertDB(modelTest1);
        dbContext.insertDB(modelTest2);
        dbContext.insertDB(modelTest3);
        System.out.println(dbContext.readById(1).toString());
        System.out.println(dbContext.readById(2).toString());
        System.out.println(dbContext.readById(3).toString());
        dbContext.closeDB();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
