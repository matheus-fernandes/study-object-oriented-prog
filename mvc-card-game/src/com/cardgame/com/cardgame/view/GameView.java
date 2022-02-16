package com.cardgame.com.cardgame.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public interface GameView {

    List<String> askPlayersNames();
    void reportCardsDealt();
    void askForFlip();
    boolean askForNewGame();
    void showFaceDownCardForPlayer(String playerName);
    void showCardForPlayer(String rank, String suit, String playerName);
    void showWinner(String winnerName);

}
