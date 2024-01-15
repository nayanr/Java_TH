package org.example.testtwo.managers;

import org.example.testtwo.enums.GameMove;

public class BasicVersusComputerStrategy implements WinnerStrategy {
    @Override
    public String determineWinner(GameMove userGameMove, GameMove computerGameMove) {
        if (userGameMove.equals(computerGameMove)) {
            return "It's a tie!";
        } else if ((userGameMove.equals(GameMove.ROCK) && computerGameMove.equals(GameMove.SCISSORS)) ||
                (userGameMove.equals(GameMove.PAPER) && computerGameMove.equals(GameMove.ROCK)) ||
                (userGameMove.equals(GameMove.SCISSORS) && computerGameMove.equals(GameMove.PAPER))){
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
