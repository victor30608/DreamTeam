package sample.Controller;

import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.json.JSONException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
public class MapFrame {
    private  static WebEngine webEngine;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Text;
    @FXML
    private WebView Map;

    @FXML
    private Button OK_BUT;

    @FXML
    void OK_CLICK(ActionEvent event) {
        try {
            String data = Text.getText();
            Point a= new Point();
            a = Geodecoding.decode(data);
            webEngine.executeScript("searcPost('"+a.Getlat()+"' ,'"+a.Getlng()+"')");
            webEngine.executeScript("movemap('"+a.Getlat()+"' ,'"+a.Getlng()+"')");
           webEngine.executeScript("customicon('"+a.Getlat()+"' ,'"+a.Getlng()+"')");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @FXML
    void initialize() {
        webEngine = Map.getEngine();
        final URL urlGoogleMaps = getClass().getResource("../Viewer/demo.html");
        webEngine.load(urlGoogleMaps.toExternalForm());

    }
}
