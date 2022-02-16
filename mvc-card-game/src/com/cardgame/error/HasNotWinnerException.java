package com.cardgame.error;

public class HasNotWinnerException extends RuntimeException{
    public HasNotWinnerException(){
        super("There is no winner as requested.");
    }
}
