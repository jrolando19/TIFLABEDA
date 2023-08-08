package com.mycompany.eda_tif_p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import myExceptions.ExceptionNoFound;

public class loadAlmacenesController implements Initializable {
    
    @FXML
    private Button btnSelect;
    //private TextArea txtFiles;
 
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnSelect.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Buscar Archivo");

            // Agregar filtros para facilitar la busqueda
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All Images", "*.*"),
                    new FileChooser.ExtensionFilter("TXT", "*.txt")
            );

            // Obtener la imagen seleccionada
            List<File> list = fileChooser.showOpenMultipleDialog(null);

            for (int i=0; i<list.size(); i++){
                //path: list.get(i).getAbsolutePath()
                File doc = new File( list.get(i).getAbsolutePath());
                File docPrin = new File( "D:\\Java\\eda_tif_p1\\src\\main\\resources\\com\\mycompany\\eda_tif_p1\\almacen.txt");

                BufferedReader obj;
                try {
                    obj = new BufferedReader(new FileReader(doc));
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                    obj=null;
                }

                //Completado de Avl de Almacenes
                String strng="";

                try {
                    while ((strng = obj.readLine()) != null){
                        String[] parts = strng.split(",");
                        //System.out.println(parts[0]+parts[1]+parts[2] );
                        App.getAvlAlm().insert(parts[1],new Almacen(Integer.parseInt(parts[0]),parts[1],parts[2]));
                        
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ExceptionNoFound ex) {
                    ex.printStackTrace();
                }
                
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(docPrin, true))) {
                    // true en FileWriter permite escribir al final del archivo, sin sobrescribirlo.
                    writer.write(strng+"\n");

                    // Es importante cerrar el escritor después de terminar de escribir.
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
        });
    }
    /*
    TEXTAREA METHODS
    
    void insert(String str, int pos) 
    Inserts the specified text at the specified position.

    public void setText(String t)
    Sets the text of JTextArea
    */
    //#volverMain
    @FXML
    private void volverMain() throws IOException {
        App.setRoot("main");
    }
}
