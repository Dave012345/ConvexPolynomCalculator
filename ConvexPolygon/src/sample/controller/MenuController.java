package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import sample.service.StageService;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    public static String pushedButton = "";

    private StageService stageService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.stageService = new StageService();
    }

    @FXML
    public void diagonalBy1Vertex(){
        this.pushedButton = "just1Vertex";
        stageService.sceneToPrimaryStage("InputView.fxml");
    }
    @FXML
    public void allDiagonals(){
        this.pushedButton = "allDiagonals";
        stageService.sceneToPrimaryStage("InputView.fxml");
    }

    @FXML
    public void interorAngles(){
        this.pushedButton = "interiorAngles";
        stageService.sceneToPrimaryStage("InputView.fxml");
    }
}
