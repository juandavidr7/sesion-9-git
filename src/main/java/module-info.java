module com.example.sesion9git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sesion9git to javafx.fxml;
    exports com.example.sesion9git;
}