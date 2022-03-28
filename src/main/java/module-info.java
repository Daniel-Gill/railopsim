module net.danielgill.railopsim {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens net.danielgill.railopsim to javafx.fxml;
    opens net.danielgill.railopsim.gui to javafx.fxml;
    exports net.danielgill.railopsim;
    exports net.danielgill.railopsim.gui;
}
