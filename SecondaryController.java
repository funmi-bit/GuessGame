<<<<<<< HEAD
package com.mycompany.guessgame;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        GuessTheNumber.setRoot("primary");
    }
=======
package com.mycompany.guessgame;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
>>>>>>> 911aa5ff49c584a31b293bb972dcd75079843cc7
}