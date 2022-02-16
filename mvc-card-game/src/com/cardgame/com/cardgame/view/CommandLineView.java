package com.cardgame.com.cardgame.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CommandLineView implements GameView {
    private final Scanner input = new Scanner(in);

    @Override
    public List<String> askPlayersNames(){
        printNamesRequisition();
        return readNames();
    }

    private List<String> readNames(){
        List<String> names = new ArrayList<>();

        String name = readName();
        while (isValidName(name)) {
            names.add(name);
            showPlayerName(name);
            name = readName();
        }

        reportNameCollected();
        return names;
    }

    private String readName(){
        out.println("\nEnter the player name or type [ENTER] only:");
        return input.nextLine();
    }

    private boolean isValidName(String name){
        return !name.isEmpty();
    }

    private void reportNameCollected(){
        out.println("Thanks for the players names!\n");
    }

    public void reportCardsDealt(){
        out.println("The cards were dealt:\n");
    }

    private void printNamesRequisition(){
        out.println("Requesting the players' names:");
    }

    @Override
    public void askForFlip(){
        out.println("\nPress [ENTER] to revel cards");
        input.nextLine();
    }

    @Override
    public boolean askForNewGame() {
        out.println("\nPress [ENTER] to deal again");
        input.nextLine();
        return true;
    }

    private void showPlayerName(String playerName) {
        out.println(formattedPlayer(playerName));
    }

    private String formattedPlayer(String playerName){
        return "[name: " + playerName + "]";
    }

    @Override
    public void showFaceDownCardForPlayer(String playerName){
        String formattedPlayer = formattedPlayer(playerName);
        String formattedCard = formattedCard("?", "?");

        out.println(formattedCardOfPlayer(formattedCard, formattedPlayer));
    }

    private String formattedCard(String rank, String suit){
        return "[rank: " + rank + ", suit: " + suit + "]";
    }

    @Override
    public void showCardForPlayer(String rank, String suit, String playerName){
        String formattedPlayer = formattedPlayer(playerName);
        String formattedCard = formattedCard(rank, suit);

        out.println(formattedCardOfPlayer(formattedCard, formattedPlayer));
    }

    private String formattedCardOfPlayer(String formattedCard, String formattedPlayer){
        return "[card: " + formattedCard + ", player: " + formattedPlayer + "]";
    }

    @Override
    public void showWinner(String winnerName){
        out.println("\nWinner: " + winnerName + "!");
    }
}
