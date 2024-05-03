package com.mycompany.guessgame;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        GuessTheNumber.setRoot("primary");
    }
}