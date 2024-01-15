package org.example.testtwo.enums;

import org.example.testtwo.exceptions.InvalidOptionSelectedException;

public enum GameMove {
    PAPER,SCISSORS,ROCK;

    public static GameMove getGameMoveForInput(String option) {
        if (PAPER.name().equalsIgnoreCase(option)) {
            return PAPER;
        } else if(SCISSORS.name().equalsIgnoreCase(option)) {
            return SCISSORS;
        } else if(ROCK.name().equalsIgnoreCase(option)) {
            return ROCK;
        } else {
            throw new InvalidOptionSelectedException("The selected option is invalid for the game");
        }
    }


}
