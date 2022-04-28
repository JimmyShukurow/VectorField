module com.example.vectorfieldapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vectorfieldapp to javafx.fxml;
    exports com.example.vectorfieldapp;
}