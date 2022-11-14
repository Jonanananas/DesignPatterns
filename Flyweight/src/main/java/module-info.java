module com.flyweightborder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires transitive javafx.graphics;

    opens com.flyweightborder to javafx.fxml;

    exports com.flyweightborder;
}
