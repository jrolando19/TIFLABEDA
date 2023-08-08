module com.mycompany.eda_tif_p1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.eda_tif_p1 to javafx.fxml;
    exports com.mycompany.eda_tif_p1;
}
