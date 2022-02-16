package com.cardgame.program;

import com.cardgame.com.cardgame.controller.GameController;
import com.cardgame.com.cardgame.games.evaluator.HighCardWinnerEvaluator;
import com.cardgame.com.cardgame.games.evaluator.WinnerEvaluator;
import com.cardgame.com.cardgame.view.CommandLineView;
import com.cardgame.com.cardgame.view.GameView;
import com.cardgame.model.Deck;

public interface Main {
    static void main(String[] args) {
        WinnerEvaluator winnerEvaluator = new HighCardWinnerEvaluator();
        GameView gameView = new CommandLineView();
        Deck deck = new Deck();

        GameController controller = new GameController(
                winnerEvaluator, gameView, deck);

        controller.run();
    }
}
