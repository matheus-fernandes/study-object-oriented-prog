package com.cardgame.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CommandLineView implements GameView {
    private final Scanner input = new Scanner(in);

    @Override
    public List<String> askPlayersNames(int maxOfPlayers){
        printNamesRequisition();
        return readNames(maxOfPlayers);
    }

    private List<String> readNames(int maxOfPlayers){
        List<String> namesAlreadyGotten = new ArrayList<>();

        String name = readName();
        while (shouldContinueAskingNameLine(maxOfPlayers, namesAlreadyGotten, name)) {
            if (isValidName(name)) {
                namesAlreadyGotten.add(name);
                showPlayerName(name);
            }
            name = readName();
        }

        reportNameCollected();
        return namesAlreadyGotten;
    }

    private boolean shouldContinueAskingNameLine(int maxOfPlayers, List<String> namesAlreadyGotten, String newName){
        if (namesAlreadyGotten.size() >= maxOfPlayers){
            return false;
        }

        if (!isValidName(newName)){
            return namesAlreadyGotten.isEmpty();
        }

        return true;
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
    public boolean askForNewDeal() {
        final String NOT = "N";

        out.println("\nPress [ENTER] to deal again or [" + NOT + "] to not:");
        String line = input.nextLine();

        if (line.isEmpty()){
            return true;
        }
        else if (NOT.equalsIgnoreCase(line)){
            return false;
        }

        return askForNewDeal();
    }

    @Override
    public boolean askForRestart() {
        final String RESTART = "R";

        out.println("\nPress [" + RESTART + "] to restart all the game or any other key to quit:");
        String line = input.nextLine();

        if (RESTART.equalsIgnoreCase(line)){
            return true;
        }

        return false;
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
