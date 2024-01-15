package org.example.testtwo.managers;


import org.example.testtwo.enums.GameMove;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BasicVersusComputerStrategyTest {

    @Test
    public void testTie() {
        BasicVersusComputerStrategy strategy = new BasicVersusComputerStrategy();
        assertEquals("It's a tie!", strategy.determineWinner(GameMove.ROCK, GameMove.ROCK));
        assertEquals("It's a tie!", strategy.determineWinner(GameMove.PAPER, GameMove.PAPER));
        assertEquals("It's a tie!", strategy.determineWinner(GameMove.SCISSORS, GameMove.SCISSORS));
    }

    @Test
    public void testUserWin() {
        BasicVersusComputerStrategy strategy = new BasicVersusComputerStrategy();
        assertEquals("You win!", strategy.determineWinner(GameMove.ROCK, GameMove.SCISSORS));
        assertEquals("You win!", strategy.determineWinner(GameMove.PAPER, GameMove.ROCK));
        assertEquals("You win!", strategy.determineWinner(GameMove.SCISSORS, GameMove.PAPER));
    }

    @Test
    public void testComputerWin() {
        BasicVersusComputerStrategy strategy = new BasicVersusComputerStrategy();
        assertEquals("Computer wins!", strategy.determineWinner(GameMove.ROCK, GameMove.PAPER));
        assertEquals("Computer wins!", strategy.determineWinner(GameMove.PAPER, GameMove.SCISSORS));
        assertEquals("Computer wins!", strategy.determineWinner(GameMove.SCISSORS, GameMove.ROCK));
    }

}