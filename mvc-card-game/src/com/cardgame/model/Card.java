package com.cardgame.model;

public class Card{
    Rank rank;
    Suit suit;
    boolean faceUp;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        this.faceUp = false;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public boolean flip() {
        faceUp = !faceUp;
        return faceUp;
    }

}
