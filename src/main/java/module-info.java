module com.example.pbo_oktober {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pbo_oktober to javafx.fxml;
    exports com.example.pbo_oktober;
}
