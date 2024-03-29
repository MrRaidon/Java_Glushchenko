module com.example.frontend {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.google.gson;
    requires unirest.java;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.frontend to javafx.fxml;
    exports com.example.frontend;
}