import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск Java FX приложения.");
        launch(args);
    }

    public void init() {
        System.out.println("В теле метода init()");
    }

    public void start(Stage myStage) {
        System.out.println("В теле метода start().");
        myStage.setTitle("Java FX Skeleton.");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        myStage.show();
    }

    public void stop() {
        System.out.println("В теле метода stop().");
    }
}
