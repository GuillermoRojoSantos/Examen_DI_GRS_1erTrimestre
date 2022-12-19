package com.examen.examen_di_grs_1ertrimestre;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class formController {

    @FXML
    private Button btnAdd;

    @FXML
    private TableColumn<?, ?> cActividad;

    @FXML
    private TableColumn<?, ?> cAltura;

    @FXML
    private TableColumn<?, ?> cEdad;

    @FXML
    private TableColumn<?, ?> cGET;

    @FXML
    private TableColumn<?, ?> cGer;

    @FXML
    private TableColumn<?, ?> cNombre;

    @FXML
    private TableColumn<?, ?> cPeso;

    @FXML
    private TableColumn<?, ?> cSexo;

    @FXML
    private ComboBox<?> comboActividad;

    @FXML
    private ComboBox<?> comboSexo;

    @FXML
    private TextField fieldNombre;

    @FXML
    private Spinner<?> spinnerAltura;

    @FXML
    private Spinner<?> spinnerEdad;

    @FXML
    private Spinner<?> spinnerPeso;

    @FXML
    private TableView<?> tabla;

    @FXML
    private Text txtErrores;

    @FXML
    void addInfoTabla(ActionEvent event) {

    }

}
