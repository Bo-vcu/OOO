package ui;

import javafx.application.Application;
import javafx.stage.Stage;

public class SecretAppSolution extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        new EncoderUiSolution(stage);
    }
}