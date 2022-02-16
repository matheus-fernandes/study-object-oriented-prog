package com.cardgame.error;

public class HandEmptyException extends RuntimeException{
    public HandEmptyException(){
        super("The hand is empty and cannot provide a card.");
    }
}
