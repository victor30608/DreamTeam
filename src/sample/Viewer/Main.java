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
        Geodecoding.decode("41.8839,-87.6389,150");
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

//<!--function addmark(lat,lng)-->
//<!--{-->
//<!--var parisMarker = new H.map.Marker({lat:lat, lng:lng});-->
//<!--map.addObject(parisMarker);-->
//<!--}-->