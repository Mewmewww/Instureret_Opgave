package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimpelTest extends Application {
    int num = 1;
    String text = "\n";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static void opretOpskrifter() {
        System.out.println("Velkommen til min opskrifts-applikations dummy");
    }
    public static void blankLinje() {
        System.out.println("\n");
    }


    public static void main(String[] args) {

        opretOpskrifter();
        blankLinje();
        launch(args);
    }
}
