import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {

    Label response;


    public static void main(String[] args) {
     launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate JavaFX Buttons and Events.");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene( rootNode,500, 500);
        myStage.setScene(myScene);
        response = new Label("Push a Button");


        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

        btnAlpha.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btnAlpha.setStyle("-fx-background-color: green");
                btnAlpha.setTranslateX(Math.random()*150-50);
                btnAlpha.setTranslateY(Math.random()*150-50);
            }
        });

        btnAlpha.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Alpha was pressed");
                alert.showAndWait();
            }
        });

        btnAlpha.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btnAlpha.setStyle("-fx-background-style: default");
            }
        });

        btnBeta.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btnBeta.setStyle("-fx-background-color: yellow");
            }
        });

        btnBeta.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btnBeta.setStyle("-fx-background-style: default");
            }
        });

        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Alpha was pressed");
            }
        });

        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Beta was pressed");
            }
        });


        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
        myStage.show();
    }
}
