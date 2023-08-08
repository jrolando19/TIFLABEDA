package com.mycompany.eda_tif_p1;

import com.mycompany.avlaplication.Avl;
import com.mycompany.avlaplication.AvlAlm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import myExceptions.ExceptionNoFound;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    //Determinar una estructura que almacenara los objetos, que contendran al almacen y a los productos
    private static AvlAlm<Almacen> avlAlm = new AvlAlm<Almacen>();

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) throws IOException, ExceptionNoFound {
        completeAvlAlmacen();
        launch();
    }
    
    public static void completeAvlAlmacen() throws IOException, ExceptionNoFound{
        File doc = new File("D:\\Java\\eda_tif_p1\\src\\main\\resources\\com\\mycompany\\eda_tif_p1\\almacen.txt");

        BufferedReader obj = new BufferedReader(new FileReader(doc));
        
        //Completado de Avl de Almacenes
        String strng;
        
        while ((strng = obj.readLine()) != null){
            String[] parts = strng.split(",");
            //System.out.println(parts[0]+parts[1]+parts[2] );
            avlAlm.insert(parts[1],new Almacen(Integer.parseInt(parts[0]),parts[1],parts[2]));
        }

    }
    
    public static AvlAlm<Almacen> getAvlAlm(){
        return avlAlm;
    }
}