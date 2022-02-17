package com.cardgame.program;

import com.cardgame.controller.GameController;
import com.cardgame.evaluator.HighCardWinnerEvaluator;
import com.cardgame.evaluator.WinnerEvaluator;
import com.cardgame.view.CommandLineView;
import com.cardgame.view.GameView;
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
