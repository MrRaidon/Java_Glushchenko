module com.example.JavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires unirest.java;

    opens com.example.JavaFX to javafx.fxml;
    opens com.example.JavaFX.schemas to com.google.gson;
    exports com.example.JavaFX;
}