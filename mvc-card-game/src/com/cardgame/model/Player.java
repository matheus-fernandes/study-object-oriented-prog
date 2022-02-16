package com.cardgame.model;

public class Player {
    String name;
    Hand hand;

    public Player( String name){
        this.name = name;
        this.hand = new Hand();
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public Card getFirstCard(){
        return hand.getFistCard();
    }

    public Card removeFistCard() {
        return hand.removeFirstCard();
    }

    public String getName() {
        return name;
    }

}
