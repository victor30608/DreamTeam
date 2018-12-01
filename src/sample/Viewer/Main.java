package sample.Viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("map.fxml"));
        primaryStage.setTitle("Delivery");
//        primaryStage.getIcons().add(new Image("sample/assets/delivryicon.png"));

        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.setResizable(false);
        primaryStage.show();
        // cl.initialize();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
