package by.stormnet.figuresfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FiguresFxApp extends Application {
    public static void main(String[] args)  {
        launch();
    }

    @Override
    public void start(Stage window) throws IOException {
        window.setTitle("FiguresFX");//window name
        window.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("/views/MainScreenView.fxml"));
        window.setScene(new Scene(root, 1024, 600));
        window.show();
    }
}
