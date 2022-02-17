package com.cardgame.view;

import java.util.List;

public interface GameView {

    List<String> askPlayersNames(int maxOfPlayers);
    void reportCardsDealt();

    void askForFlip();
    boolean askForNewDeal();
    boolean askForRestart();

    void showFaceDownCardForPlayer(String playerName);
    void showCardForPlayer(String rank, String suit, String playerName);
    void showWinner(String winnerName);

}
