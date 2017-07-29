import graphicinterface.GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Geometry");
        primaryStage.setHeight(500);
        primaryStage.setWidth(700);
        primaryStage.setResizable(false);
        Pane root = new GUI(primaryStage.getWidth(),primaryStage.getHeight()).createInterface();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}