package org.example.testtwo.game;

import org.example.testtwo.enums.GameMove;
import org.example.testtwo.managers.IOManager;
import org.example.testtwo.managers.WinnerStrategy;
import org.example.testtwo.player.ComputerPlayer;
import org.example.testtwo.player.RealPlayer;
import org.example.testtwo.player.RpsPlayer;

import java.util.Objects;
import java.util.UUID;

public class PlayAgainstComputerGame implements Game{

    private final RpsPlayer player1;
    private final RpsPlayer player2;

    private final WinnerStrategy winnerStrategy;
    private final IOManager ioManager;

    public PlayAgainstComputerGame(final RpsPlayer player1,
                                   final RpsPlayer player2,
                                   final WinnerStrategy winnerStrategy,
                                   final IOManager ioManager){
        this.player1 = player1;
        this.player2 = player2;
        this.winnerStrategy = winnerStrategy;
        this.ioManager = ioManager;

    }

    @Override
    public void playGame() {
        GameMove computerMove = player1.getSelectedOption();
        GameMove realPlayerMove = player2.getSelectedOption();
        String gameResult = winnerStrategy.determineWinner(realPlayerMove,computerMove);
        ioManager.sendOutputToConsole(gameResult);
    }

    public static class PlayAgainstComputerGameBuilder {
        private String realPlayerName;
        private String computerName;
        private final WinnerStrategy winnerStrategy;

        private final IOManager ioManager;

        public PlayAgainstComputerGameBuilder(final WinnerStrategy winnerStrategy, IOManager ioManager) {
            this.winnerStrategy = winnerStrategy;
            this.ioManager = ioManager;
        }

        public PlayAgainstComputerGameBuilder withRealPlayerName(final String realPlayerName) {
            this.realPlayerName = realPlayerName;
            return this;
        }

        public PlayAgainstComputerGameBuilder withComputerName(final String computerName) {
            this.computerName = computerName;
            return this;
        }

        public PlayAgainstComputerGame build() {
            ComputerPlayer computerPlayer = new ComputerPlayer(Objects.isNull(computerName) ? UUID.randomUUID().toString() : computerName);
            RealPlayer realPlayer = new RealPlayer(Objects.isNull(realPlayerName) ? UUID.randomUUID().toString() : realPlayerName, ioManager);

            return new PlayAgainstComputerGame(computerPlayer,realPlayer,this.winnerStrategy,ioManager);
        }

    }
}
