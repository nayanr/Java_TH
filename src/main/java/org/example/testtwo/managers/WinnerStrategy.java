package org.example.testtwo.managers;

import org.example.testtwo.enums.GameMove;

public interface WinnerStrategy {
    String determineWinner(GameMove userMove, GameMove computerMove);
}
