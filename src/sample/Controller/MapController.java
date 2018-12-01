package sample.Controller;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;

public class MapController {
    private  static WebEngine webEngine;
    @FXML
    private Button OK_Button;

    @FXML
    private Button Back_Button;

    @FXML
    private TextField AddressField;

    @FXML
    private TextField OrderField;

    @FXML
    private TextField TimeField;

    @FXML
    private WebView Map;
    @FXML
    private TextField Exception;
    @FXML
    void Back_Action(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Viewer/start_page.fxml"));
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
    void OK_CLICKED(ActionEvent event)
    {
        webEngine.executeScript("getGeocodingService('55.99906 ,37.22374')");
//       webEngine.executeScript("addmark(55.99906,37.22374)");
//        webEngine.executeScript("addmark(56,37)");
//
    }
    @FXML
    void initialize() {

        Exception.setVisible(false);
        webEngine = Map.getEngine();
        final URL urlGoogleMaps = getClass().getResource("../Viewer/demo.html");
        webEngine.load(urlGoogleMaps.toExternalForm());



    }

}
