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
class LostState implements GameState {
    private final GuessGame game;

    LostState(GuessGame game) {
        this.game = game;
    }