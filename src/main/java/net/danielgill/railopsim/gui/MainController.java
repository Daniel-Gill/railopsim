package net.danielgill.railopsim.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import net.danielgill.railopsim.App;

public class MainController implements Initializable {
    @FXML private Canvas canvas;
    private static GraphicsContext gc;

    private static double currentX = 0;
    private static double currentY = 0;
    private static Grid grid;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        gc = canvas.getGraphicsContext2D();

        // moves the grid with the mouse
        canvas.setOnMouseDragged(value -> {
            currentX = value.getX();
            currentY = value.getY();
            drawGrid(grid);
        });

        
    }

    public static void drawGrid(Grid g) {
        grid = g;
        gc.clearRect(0, 0, App.mc.getCanvas().getWidth(), App.mc.getCanvas().getHeight());
        int size = g.getSize();
        for(GridElement ge : g.getElements()) {
            gc.drawImage(ge.getIcon(), ge.getX() * size + currentX, ge.getY() * size + currentY, size, size);
        }
    }

    public Canvas getCanvas() {
        return canvas;
    }
    
}
