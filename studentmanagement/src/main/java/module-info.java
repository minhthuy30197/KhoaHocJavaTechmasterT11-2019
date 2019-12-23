module com.company {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens com.company to javafx.fxml;
    exports com.company;
}