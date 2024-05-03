<<<<<<< HEAD
<<<<<<<< HEAD:src/main/java/com/mycompany/guessgame/WonState.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessgame;

/**
 *
 * @author HP
 */
// Concrete state=
class WonState implements GameState {
    private final GuessGame game;

    WonState(GuessGame game) {
        this.game = game;
    }

    @Override
    public void handleGuess(int guess) {
        // No need to handle guesses in the WonState
    }
}
========
=======
>>>>>>> 911aa5ff49c584a31b293bb972dcd75079843cc7
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
class WonState implements GameState {
    private final GuessGame game;

    WonState(GuessGame game) {
        this.game = game;
    }

    @Override
    public void handleGuess(int guess) {
        // No need to handle guesses in the WonState
    }
}
<<<<<<< HEAD
>>>>>>>> 911aa5ff49c584a31b293bb972dcd75079843cc7:WonState.java
=======
>>>>>>> 911aa5ff49c584a31b293bb972dcd75079843cc7
