package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
* Itt is a desktop application for calculating a convex polygon.
* You can calculate the sum of the diagonals from a single vertex of the polygon,
* or the all diagonals from the all vertices,
* plus you can also calculate the sum of the interior angles of the convex polygon.
*
*
 * @author David Burka
 * @version 1.0
 * @since 2021.07.27
* */



public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("./views/MenuView.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.show();

        sceneChange(root);
    }

    /**
     * It can to change the scene of primaryStage dynamically with a root param*/
    public static void sceneChange(Parent root){
        primaryStage.setScene(new Scene(root, 700, 600));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
