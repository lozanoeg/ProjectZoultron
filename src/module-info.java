module projectzoultron {
    requires javafx.fxml;
    requires javafx.controls;

    opens main to javafx.fxml;
    opens main.login to javafx.fxml;
    opens main.signup to javafx.fxml;
    exports main;
}