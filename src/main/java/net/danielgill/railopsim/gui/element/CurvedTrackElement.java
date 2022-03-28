package net.danielgill.railopsim.gui.element;

import javafx.scene.image.Image;
import net.danielgill.railopsim.gui.GridElement;

public class CurvedTrackElement extends GridElement {

    public CurvedTrackElement(int x, int y) {
        super(x, y);
    }

    @Override
    public Image getIcon() {
        return new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/BSicon_STR%2Br.svg/20px-BSicon_STR%2Br.svg.png");
    }
    
}

