module com.wordcount {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wordcount to javafx.fxml;
    exports com.wordcount;
}