package com.cardgame.model;

import com.cardgame.error.DeckEmptyException;

import java.util.*;

public class Deck {
    List<Card> cards;

    public Deck(){
        generateCards();
    }

    private void generateCards() {
        cards = new ArrayList<>();

        for (Rank rank: Rank.values()){
            for (Suit suit: Suit.values()){
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card removeCardFromTop(){
        if (this.cards.isEmpty()){
            throw new DeckEmptyException();
        }
        return cards.remove(0);
    }

    public void returnCardToDeck(Card card){
        this.cards.add(card);
    }
}
