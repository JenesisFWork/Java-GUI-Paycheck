module javafxpaycheck {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxpaycheck to javafx.fxml;
    exports javafxpaycheck;
}
