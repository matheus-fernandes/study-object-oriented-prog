package com.cardgame.com.cardgame.controller;

import com.cardgame.com.cardgame.games.evaluator.WinnerEvaluator;
import com.cardgame.com.cardgame.view.CommandLineView;
import com.cardgame.com.cardgame.view.GameView;
import com.cardgame.model.Card;
import com.cardgame.model.Deck;
import com.cardgame.model.Player;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    GameView view;
    Deck deck;
    List<Player> players;
    WinnerEvaluator winnerEvaluator;

    public GameController(WinnerEvaluator winnerEvaluator, GameView view, Deck deck){
        this.view = view;
        this.deck = deck;
        this.players = new ArrayList<>();
        this.winnerEvaluator = winnerEvaluator;
    }

    public void run(){
        boolean newGame = true;
        setPlayers(view.askPlayersNames());

        while(newGame){
            playTheGame();
            newGame = view.askForNewGame();
        }
    }

    private void setPlayers(List<String> names){
        this.players = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            addPlayer(names.get(i));
        }
    }


    private void addPlayer(String name) {
        players.add(new Player(name));
    }

    private void playTheGame() {
        deck.shuffle();
        this.dealCards();

        view.reportCardsDealt();
        this.showFaceDownCardForPlayers();

        view.askForFlip();
        this.flipCards();
        this.showCardsOfPlayers();

        this.announceTheWinner();
        this.collectCards();
    }

    private void dealCards(){
        for (Player player: players){
            Card card = deck.removeCardFromTop();
            player.addCardToHand(card);
        }
    }

    private void showFaceDownCardForPlayers(){
        for (Player player: players){
            showFaceDownCardForPlayer(player);
        }
    }

    private void showFaceDownCardForPlayer(Player player){
        String playerName = player.getName();
        view.showFaceDownCardForPlayer(playerName);
    }

    public void showCardsOfPlayers(){
        for (Player player: players){
            showCardOfPlayer(player);
        }
    }

    public void showCardOfPlayer(Player player){
        Card card = player.getFirstCard();
        String rank = card.getRank().name();
        String suit = card.getSuit().name();
        String playerName = player.getName();

        view.showCardForPlayer(rank, suit, playerName);
    }

    private void flipCards() {
        for (Player player: players){
            player.getFirstCard().flip();
        }
    }

    private void announceTheWinner(){
        Player winner = winnerEvaluator
                .evaluateWinner(players);

        view.showWinner(winner.getName());
    }

    private void collectCards(){
        for (Player player: players){
            Card card = player.removeFistCard();
            deck.returnCardToDeck(card);
        }
    }
}
