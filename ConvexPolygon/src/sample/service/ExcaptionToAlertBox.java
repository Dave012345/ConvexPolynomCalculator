package sample.service;

import javafx.scene.control.Alert;

/**
 * Alert popup window for exceptions */
public class ExcaptionToAlertBox {
    public ExcaptionToAlertBox(String message, String title, String headerText) {

        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
    public ExcaptionToAlertBox(String message) {

        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.setTitle("Error");
        alert.setHeaderText("ERR");
        alert.showAndWait();
    }
}
