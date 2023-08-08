package com.mycompany.eda_tif_p1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import myExceptions.ExceptionNoFound;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

public class MainController {
    
    @FXML
    //private ChoiceBox countChoiceBox;
    private Button btnIngManualAlm;
    @FXML
    private TextField txtNomAlm;
    
    @FXML
    public void initialize() {
        App.getAvlAlm().inOrden();
    }
    
    @FXML
    private void loadAlmacenes() throws IOException {
        App.setRoot("loadAlmacenes");
    }
    
    @FXML
    private void buscarAlmacen() throws IOException, ExceptionNoFound {
        String nomBus = txtNomAlm.getText();
        //System.out.println(nomBus);
        System.out.println(App.getAvlAlm().search(nomBus));
    }
    
}
