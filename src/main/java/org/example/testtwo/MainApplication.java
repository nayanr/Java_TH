package org.example.testtwo;

import org.example.testtwo.game.GameManager;
import org.example.testtwo.managers.BasicVersusComputerStrategy;
import org.example.testtwo.managers.BufferedReaderIOManager;
import org.example.testtwo.managers.IOManager;
import org.example.testtwo.managers.WinnerStrategy;

public class MainApplication {


    public static void main(String[] args) {
        IOManager ioManager = new BufferedReaderIOManager();
        WinnerStrategy winnerStrategy = new BasicVersusComputerStrategy();
        GameManager gameManager = new GameManager(ioManager,winnerStrategy);
        gameManager.startTwoPlayerGame();
    }
}
