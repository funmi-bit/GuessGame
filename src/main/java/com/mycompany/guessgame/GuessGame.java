/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Subject class
final class GuessGame {
    private final List<GuessObserver> observers = new ArrayList<>();
    private final Random random = new Random();
    private int targetNumber;
    private int attemptsLeft;
    private GameState state;

    GuessGame() {
        reset();
    }

    void reset() {
        targetNumber = random.nextInt(100) + 1;
        attemptsLeft = 10;
        state = new PlayingState(this);
        notifyObservers("New game started. You have " + attemptsLeft + " attempts left.");
    }

    void addObserver(GuessObserver observer) {
        observers.add(observer);
    }

    void notifyObservers(String message) {
        for (GuessObserver observer : observers) {
            observer.update(message);
        }
    }

    int getTargetNumber() {
        return targetNumber;
    }

    int getAttemptsLeft() {
        return attemptsLeft;
    }

    void decrementAttemptsLeft() {
        attemptsLeft--;
    }

    void setState(GameState state) {
        this.state = state;
    }

    void handleGuess(int guess) {
        state.handleGuess(guess);
    }
}