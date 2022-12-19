module com.examen.examen_di_grs_1ertrimestre {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.examen.examen_di_grs_1ertrimestre to javafx.fxml;
    exports com.examen.examen_di_grs_1ertrimestre;
}