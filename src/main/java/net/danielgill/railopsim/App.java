package net.danielgill.railopsim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.danielgill.railopsim.gui.Grid;
import net.danielgill.railopsim.gui.MainController;
import net.danielgill.railopsim.gui.element.CurvedTrackElement;
import net.danielgill.railopsim.gui.element.StraightTrackElement;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static MainController mc;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"));
        stage.setScene(scene);
        stage.setTitle("ROS");
        stage.show();

        StraightTrackElement te = new StraightTrackElement(0, 0);
        CurvedTrackElement te1 = new CurvedTrackElement(2, 0);
        StraightTrackElement te2 = new StraightTrackElement(2, 1);
        Grid g = new Grid(20);
        g.addElement(te);
        g.addElement(te1);
        g.addElement(te2);
        g.draw();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Parent root = fxmlLoader.load();
        mc = fxmlLoader.getController();
        return root;
    }

    public static void main(String[] args) {
        launch();
    }

}