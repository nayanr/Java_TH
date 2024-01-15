package org.example.testtwo.player;

import org.example.testtwo.enums.GameMove;

public abstract class RpsPlayer {

    private final String playerName;

    public String getPlayerName() {
        return this.playerName;
    }

    protected RpsPlayer(final String playerName){
        this.playerName = playerName;
    }

    public abstract GameMove getSelectedOption();
}
