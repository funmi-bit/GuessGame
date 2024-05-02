module com.mycompany.guessgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.guessgame to javafx.fxml;
    exports com.mycompany.guessgame;
}
