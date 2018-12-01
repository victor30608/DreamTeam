import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FrameContr {

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

    }

    @FXML
    void initialize() {
        assert loginbut != null : "fx:id=\"loginbut\" was not injected: check your FXML file 'mainframe.fxml'.";
        assert emailfield != null : "fx:id=\"emailfield\" was not injected: check your FXML file 'mainframe.fxml'.";

    }
}
