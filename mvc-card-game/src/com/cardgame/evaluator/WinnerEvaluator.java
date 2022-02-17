package com.cardgame.evaluator;


import com.cardgame.model.Player;
import java.util.List;

public interface WinnerEvaluator {
    Player evaluateWinner(List<Player> players);
}
