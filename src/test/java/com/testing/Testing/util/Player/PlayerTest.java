package com.testing.Testing.util.Player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loses_when_dice_number_is_to_low(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 5);
        assertEquals(false, player.play());
    }

    @Test
    public void win_when_dice_number_is_big(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);
        Player player = new Player(dice, 5);
        assertEquals(true, player.play());
    }
}