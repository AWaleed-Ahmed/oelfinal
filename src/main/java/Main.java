import controller.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        SceneController.setStage(primaryStage);
        SceneController sceneController = new SceneController();
        sceneController.goToWelcome(null);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
