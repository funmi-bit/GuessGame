package com.mycompany.guessgame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX application for the "Guess the Number" game.
 */
public class GuessTheNumber extends Application implements GuessObserver {

    private GuessGame game;
    private Label messageLabel;
    private TextField guessField;

    /**
     * Method to start the JavaFX application.
     * 
     * @param primaryStage The primary stage of the application.
     */
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

    /**
     * Method to handle user guesses.
     */
    private void handleGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            game.handleGuess(guess);
            guessField.clear();
        } catch (NumberFormatException e) {
            update("Invalid input. Please enter a number.");
        }
    }

    /**
     * Method to reset the game.
     */
    private void resetGame() {
        game.reset();
        guessField.clear();
    }

    /**
     * Method to update the UI with game state messages.
     * 
     * @param message The message to display.
     */
    @Override
    public void update(String message) {
        messageLabel.setText(message);
    }

    /**
     * Main method to launch the JavaFX application.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
