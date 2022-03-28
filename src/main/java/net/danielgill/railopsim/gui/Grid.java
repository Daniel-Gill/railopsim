package net.danielgill.railopsim.gui;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private int size;
    private List<GridElement> elements;

    public Grid(int size) {
        this.size = size;
        elements = new ArrayList<GridElement>();
    }

    public void draw() {
        MainController.drawGrid(this);
    }
    
    public int getSize() {
        return size;
    }

    public List<GridElement> getElements() {
        return elements;
    }
    public void addElement(GridElement element) {
        elements.add(element);
    }

}
