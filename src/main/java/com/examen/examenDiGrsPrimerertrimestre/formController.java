package com.examen.examenDiGrsPrimerertrimestre;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class formController implements Initializable {

    @FXML
    private Button btnAdd;

    @FXML
    private TableColumn<Persona, String> cActividad;

    @FXML
    private TableColumn<Persona, Double> cAltura;

    @FXML
    private TableColumn<Persona, Integer> cEdad;

    @FXML
    private TableColumn<Persona, Double> cGET;

    @FXML
    private TableColumn<Persona, Double> cGer;

    @FXML
    private TableColumn<Persona, String> cNombre;

    @FXML
    private TableColumn<Persona, Double> cPeso;

    @FXML
    private TableColumn<Persona, String> cSexo;

    @FXML
    private ComboBox<String> comboActividad;

    @FXML
    private ComboBox<String> comboSexo;

    @FXML
    private TextField fieldNombre;

    @FXML
    private Spinner<Double> spinnerAltura;

    @FXML
    private Spinner<Integer> spinnerEdad;

    @FXML
    private Spinner<Double> spinnerPeso;

    @FXML
    private TableView<Persona> tabla;

    @FXML
    private Text txtErrores;

    @FXML
    void addInfoTabla(ActionEvent event) {

        if(spinnerEdad.getValueFactory().getValue()==0.0){
            txtErrores.setText("El campo de Edad está vacío");
        } else if (spinnerPeso.getValueFactory().getValue()==0.0) {
            txtErrores.setText("El campo de Edad está vacío");
        } else if (spinnerAltura.getValueFactory().getValue()==0.0) {
            txtErrores.setText("El campo de Altura está vacío");
        } else if (comboSexo.valueProperty().getValue()==null) {
            txtErrores.setText("El campo de Sexo está vacío");
        } else if (comboActividad.valueProperty().getValue()==null) {
            txtErrores.setText("El campo de Actividad está vacío");
        }else{
            Persona persona = new Persona(fieldNombre.getText(), spinnerEdad.getValue(), spinnerPeso.getValue(),
                    spinnerAltura.getValue(), comboSexo.getValue(), comboActividad.getValue());

            ObservableList<Persona> personaObservableList = FXCollections.observableArrayList();
            personaObservableList.addAll(tabla.getItems());
            personaObservableList.add(persona);
            tabla.setItems(personaObservableList);
            fieldNombre.setText("");
            spinnerEdad.getValueFactory().setValue(0);
            spinnerPeso.getValueFactory().setValue((double)0);
            spinnerAltura.getValueFactory().setValue((double) 0);
            comboSexo.valueProperty().set(null);
            comboActividad.valueProperty().set(null);
            txtErrores.setText("Información del programa");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> sexo = FXCollections.observableArrayList();
        ObservableList<String> actividad = FXCollections.observableArrayList();
        sexo.addAll("Hombre", "Mujer");
        actividad.addAll("Ligera", "Muy ligera", "Moderada", "Intensa");
        comboActividad.setItems(actividad);
        comboSexo.setItems(sexo);
        spinnerEdad.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        spinnerPeso.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 300, 0));
        spinnerAltura.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 300, 0));

        cNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        cSexo.setCellValueFactory(new PropertyValueFactory("sexo"));
        cEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        cPeso.setCellValueFactory(new PropertyValueFactory("peso"));
        cAltura.setCellValueFactory(new PropertyValueFactory("altura"));
        cActividad.setCellValueFactory(new PropertyValueFactory("actividad"));
        cGET.setCellValueFactory(new PropertyValueFactory("get"));
        cGer.setCellValueFactory(new PropertyValueFactory("ger"));

    }
}
