package com.cardgame.evaluator;

import com.cardgame.model.Card;
import com.cardgame.model.Player;
import com.cardgame.model.Rank;
import com.cardgame.model.Suit;

import java.util.Comparator;

abstract class ScoreCardWinnerEvaluator implements WinnerEvaluator{
    protected abstract int comparePlayers(Player player1, Player player2);

    protected int compareCards(Card card1, Card card2) {
        int rankComparison = compareRanks(card1.getRank(), card2.getRank());
        if (rankComparison != 0){
            return rankComparison;
        }

        int suitComparison =  compareSuits(card1.getSuit(), card2.getSuit());
        if (suitComparison != 0){
            return suitComparison;
        }

        return 0;
    }

    protected int compareRanks(Rank r1, Rank r2){
        return Comparator.comparingInt(
                Rank::getRank).compare(r1, r2);
    }

    protected int compareSuits(Suit s1, Suit s2){
        return Comparator.comparing(
                Suit::getSuit).compare(s1, s2);
    }
}
