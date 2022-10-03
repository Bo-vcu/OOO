package ui;

import domain.Caesar;
import domain.CodeerContext;
import domain.CodeerStrategy;
import domain.Spiegeling;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EncoderUI {

    private Stage stage = new Stage();
    private Scene scene;
    private Label resultaatLabel = new Label();
    private Pane root;
    private Button codeer;
    private Button decodeer;
    private TextField tekst;
    private ChoiceBox<String> algoritme;
    private ClickHandler clickHandler;

    public EncoderUI() {
        root = createNodeHierarchy();
        scene = new Scene(root, 350, 400);
        stage.setScene(scene);
        stage.setTitle("Coderen");
        stage.show();
    }

    public Pane root() {
        return root;
    }

    public void setResultaatLabel(String s) {
        resultaatLabel.setText(s);
    }

    private VBox createNodeHierarchy() {
        clickHandler = new ClickHandler();
        Label tekstLabel = new Label("Typ tekst");
        tekst = new TextField();
        Label algoLabel = new Label("Kies algoritme");
        algoritme = new ChoiceBox<>();
        algoritme.getItems().addAll("Caesar", "Reverse");
        algoritme.setValue("Caesar");
        codeer = new Button("Codeer");
        decodeer = new Button("Decodeer");
        VBox p = new VBox(8);

        p.setPadding(new Insets(10));

        p.getChildren().addAll

                (tekstLabel, tekst, algoLabel, algoritme, codeer, decodeer, resultaatLabel);

        codeer.setOnAction(clickHandler);

        decodeer.setOnAction(clickHandler);

        return p;

    }

    private class ClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            String resultaat = "Tekst; " + tekst.getText() + " gekozen algoritme; " + algoritme.getValue();
            if (e.getSource() == codeer) {
                resultaat += " coderen";
                CodeerContext codeerContext = new CodeerContext(tekst.getText());
                CodeerStrategy cc = null;
                switch (algoritme.getValue()){
                    case"Caesar":
                        cc = new Caesar();
                        break;
                    case"Reverse":
                        cc = new Spiegeling();
                        break;
                }
                resultaat += "\n" + cc.codeer(tekst.getText());
            } else {
                if (e.getSource() == decodeer) {
                    resultaat += " decoderen";
                    CodeerStrategy cc = null;
                    switch (algoritme.getValue()){
                        case"Caesar":
                            cc = new Caesar();
                            break;
                        case"Reverse":
                            cc = new Spiegeling();
                            break;
                    }
                    resultaat += "\n" +  cc.decodeer(tekst.getText());
                }
            }
            setResultaatLabel(resultaat);
        }
    }
}