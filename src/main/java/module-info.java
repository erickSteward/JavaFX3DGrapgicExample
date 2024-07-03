module com.example.threedgraphicsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.threedgraphicsdemo to javafx.fxml;
    exports com.example.threedgraphicsdemo;
}