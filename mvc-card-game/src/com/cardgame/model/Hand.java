package com.cardgame.model;

import com.cardgame.error.HandEmptyException;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public Card getFistCard(){
        if (cards.isEmpty()){
            throw new HandEmptyException();
        }

        return getCard(0);
    }

    public Card removeFirstCard(){
        if (cards.isEmpty()){
            throw new HandEmptyException();
        }

        return removeCard(0);
    }

    private Card getCard(int index){
        return cards.get(index);
    }

    private Card removeCard(int index){
        return cards.remove(index);
    }


}
