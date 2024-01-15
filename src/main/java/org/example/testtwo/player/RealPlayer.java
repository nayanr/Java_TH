package org.example.testtwo.player;

import org.example.testtwo.enums.GameMove;
import org.example.testtwo.managers.IOManager;

import java.util.Optional;

public class RealPlayer extends RpsPlayer{

    private final IOManager ioManager;
    public RealPlayer(String playerName, IOManager ioManager) {
        super(playerName);
        this.ioManager = ioManager;
    }

    @Override
    public GameMove getSelectedOption() {
        Optional<String> playerMove = ioManager.getInputFromConsole();
        return playerMove.map(GameMove::getGameMoveForInput).orElse(null);
    }
}
