<<<<<<< HEAD
package com.mycompany.guessgame;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        GuessTheNumber.setRoot("secondary");
    }
}
=======
package com.mycompany.guessgame;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
>>>>>>> 911aa5ff49c584a31b293bb972dcd75079843cc7
