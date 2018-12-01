package sample.Viewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.Controller.Geodecoding;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Geodecoding.decode("55.99855 ,37.22449");
        Parent root = FXMLLoader.load(getClass().getResource("mainframe.fxml"));
        primaryStage.setTitle("Delivery");
        primaryStage.getIcons().add(new Image("sample/assets/icon.png"));

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
        // cl.initialize();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

//<!--function addmark(lat,lng)-->
//<!--{-->
//<!--var parisMarker = new H.map.Marker({lat:lat, lng:lng});-->
//<!--map.addObject(parisMarker);-->
//<!--}-->