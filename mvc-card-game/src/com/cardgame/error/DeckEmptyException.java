package com.cardgame.error;

public class DeckEmptyException extends RuntimeException{
    public DeckEmptyException(){
        super("The deck is empty and cannot provide a card.");
    }
}
