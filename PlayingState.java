/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

/**
 *
 * @author HP
 */
// Concrete state
class PlayingState implements GameState {
    private final GuessGame game;

    PlayingState(GuessGame game) {
        this.game = game;
    }

    @Override
    public void handleGuess(int guess) {
        if (guess == game.getTargetNumber()) {
            game.setState(new WonState(game));
            game.notifyObservers("You won! The number was " + game.getTargetNumber());
            
        } else if (game.getAttemptsLeft() == 1) {
            game.setState(new LostState(game));
            game.notifyObservers("You lost! The number was " + game.getTargetNumber());
            
        } else {
            game.decrementAttemptsLeft();
            game.notifyObservers(guess > game.getTargetNumber() ? "Lower" : "Higher");
        }
    }
}