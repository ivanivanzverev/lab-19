import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXButtonJoke extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate JavaFX Buttons and Events.");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 100);
        myStage.setScene(myScene);
        response = new Label("Push a Button");

        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

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
