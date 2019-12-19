module com.company {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.company to javafx.fxml;
    exports com.company;
}