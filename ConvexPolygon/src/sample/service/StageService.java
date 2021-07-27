package sample.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class StageService implements Initializable {

    private URL location;
    private ResourceBundle resources;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.location = location;
        this.resources = resources;

        System.out.println("StageService");
    }

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void sceneToPrimaryStage(String view){
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("views/"+view));
            Main.sceneChange(root);
        }catch (Exception e){
            ExcaptionToAlertBox box = new  ExcaptionToAlertBox(e.getMessage(),"SceneError","Nem sikerült beölteni a keresett fxml fájlt");
            log.error("FXMLLoader error | "+this.getClass()+" | errorMessage: "+e.getMessage() +
                    " | errorCause: "+e.getCause());
        }
    }
}
