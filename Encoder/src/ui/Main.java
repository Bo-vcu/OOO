package ui;


import domain.Caesar;
import domain.Spiegeling;
import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    EncoderUI encoderUI=new EncoderUI();
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        encoderUI.root();
    }
}