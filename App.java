package com.mycompany.guessgame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
// JavaFX Application
public class App extends Application implements GuessObserver {

    static void setRoot(String secondary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


  private GuessGame game;
    private Label messageLabel;
    private TextField guessField;

    @Override
    public void start(Stage primaryStage) {
        game = new GuessGame();
        game.addObserver(this);

        messageLabel = new Label();
        guessField = new TextField();
        Button guessButton = new Button("Guess");
        guessButton.setOnAction(event -> handleGuess());

        Button newGameButton = new Button("New Game");
        newGameButton.setOnAction(event -> resetGame());

        HBox buttonBox = new HBox(10, guessButton, newGameButton);

        VBox root = new VBox(10, messageLabel, guessField, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Guess the Number");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            game.handleGuess(guess);
            guessField.clear();
        } catch (NumberFormatException e) {
            update("Invalid input. Please enter a number.");
        }
    }

    private void resetGame() {
        game.reset();
        guessField.clear();
    }

    @Override
    public void update(String message) {
        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}