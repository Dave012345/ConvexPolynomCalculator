package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.service.InputService;
import sample.service.ResultService;
import sample.service.StageService;

import java.net.URL;
import java.util.ResourceBundle;

public class InputController implements Initializable {

    private StageService stageService;
    private InputService inputService;
    private ResultService resultService;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.stageService = new StageService();
        this.inputService = new InputService();
        this.resultService = new ResultService();
    }


    @FXML
    TextField inputTxt;
    @FXML
    Label inputLabel;
    @FXML
    Label resLabel;

    @FXML
    public void send(){
        int i = inputService.getValue(inputTxt.getText());

        switch (MenuController.pushedButton){
            case "just1Vertex":
                resLabel.setText(resultService.diagonalBy1Vertex(i));
                break;
            case "allDiagonals":
                resLabel.setText(resultService.diagonals(i));
                break;
            case "interiorAngles":
                resLabel.setText(resultService.sumOfInteriorAngles(i));
                break;
        }
    }

    @FXML
    public void back(){
        stageService.sceneToPrimaryStage("MenuView.fxml");
    }
}
