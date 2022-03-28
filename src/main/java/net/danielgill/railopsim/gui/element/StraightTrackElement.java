package net.danielgill.railopsim.gui.element;

import javafx.scene.image.Image;
import net.danielgill.railopsim.gui.GridElement;

public class StraightTrackElement extends GridElement {

    public StraightTrackElement(int x, int y) {
        super(x, y);
    }

    @Override
    public Image getIcon() {
        return new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/BSicon_STR.svg/20px-BSicon_STR.svg.png");
    }
    
}
