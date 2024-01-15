package org.example.testtwo.player;

import org.example.testtwo.enums.GameMove;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer extends RpsPlayer{

    private static final List<GameMove> AVAILABLE_GAME_MOVES = List.of(GameMove.values());

    private static final ThreadLocalRandom random = ThreadLocalRandom.current();


    public ComputerPlayer(String playerName) {
        super(playerName);
    }

    @Override
    public GameMove getSelectedOption() {
        return AVAILABLE_GAME_MOVES.get(random.nextInt(AVAILABLE_GAME_MOVES.size()));
    }
}
