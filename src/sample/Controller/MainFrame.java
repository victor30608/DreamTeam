package sample.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainFrame {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginbut;

    @FXML
    private TextField emailfield;

    @FXML
    void OK(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Viewer/mapform.fxml"));
            Parent delivery_page_parent = loader.load();
            Scene delivery_page_scene = new Scene(delivery_page_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(delivery_page_scene);
            app_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert loginbut != null : "fx:id=\"loginbut\" was not injected: check your FXML file 'mainframe.fxml'.";
        assert emailfield != null : "fx:id=\"emailfield\" was not injected: check your FXML file 'mainframe.fxml'.";

    }
}
