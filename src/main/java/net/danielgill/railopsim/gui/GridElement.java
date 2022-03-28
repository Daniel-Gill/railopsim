package net.danielgill.railopsim.gui;

import javafx.scene.image.Image;

public abstract class GridElement {
    private int x;
    private int y;

    public GridElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract Image getIcon();
}
