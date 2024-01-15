package org.example.testtwo.game;

import org.example.testtwo.enums.GameMove;
import org.example.testtwo.managers.IOManager;
import org.example.testtwo.managers.WinnerStrategy;

import java.util.Arrays;
import java.util.Optional;

public class GameManager {

    private final IOManager ioManager;
    private final WinnerStrategy winnerStrategy;



    public GameManager(IOManager ioManager,
                       WinnerStrategy winnerStrategy) {
        this.ioManager = ioManager;
        this.winnerStrategy = winnerStrategy;
    }

    public void startTwoPlayerGame(){

        ioManager.sendOutputToConsole("Please enter your name -> ");
        Optional<String> playerNameOpt = ioManager.getInputFromConsole();
        String playerName = playerNameOpt.orElse(null);
        PlayAgainstComputerGame.PlayAgainstComputerGameBuilder playAgainstComputerGameBuilder = new PlayAgainstComputerGame.PlayAgainstComputerGameBuilder(winnerStrategy, ioManager);
        Game playAgainstComputerGame = playAgainstComputerGameBuilder.withRealPlayerName(playerName).build();

        ioManager.sendOutputToConsole("Please enter number of rounds for the game -> ");
        Optional<String> numberOfRoundsOpt = ioManager.getInputFromConsole();
        int numberOfRounds = Integer.parseInt(numberOfRoundsOpt.orElse("5"));

        for(int i = 1; i <= numberOfRounds; i++){
            ioManager.sendOutputToConsole("Round -> "+ i);
            ioManager.sendOutputToConsole("Please choose any of these "+ Arrays.toString(GameMove.values()));
            playAgainstComputerGame.playGame();
        }

        ioManager.closeGame();

    }
}
