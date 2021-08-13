package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private void handleAction() {
        label.setText("Ok button pressed");
    }
}
