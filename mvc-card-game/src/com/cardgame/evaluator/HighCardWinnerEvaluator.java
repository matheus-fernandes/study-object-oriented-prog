package com.cardgame.evaluator;

import com.cardgame.error.HandEmptyException;
import com.cardgame.model.Card;
import com.cardgame.model.Player;

import java.util.List;

public class HighCardWinnerEvaluator extends ScoreCardWinnerEvaluator{
    @Override
    public Player evaluateWinner(List<Player> players){
        return players.stream()
                .max((p1, p2) -> comparePlayers(p1, p2))
                .orElseThrow(HandEmptyException::new);
    }

    @Override
    protected int comparePlayers(Player player1, Player player2){
        Card card1 = player1.getFirstCard();
        Card card2 = player2.getFirstCard();

        return compareCards(card1, card2);
    }

}
