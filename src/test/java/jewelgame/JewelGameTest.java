package jewelgame;

import org.junit.Test;

import static org.junit.Assert.*;

public class JewelGameTest {

    @Test
    public void testJewelGame() {
        JewelGame game = new JewelGame();

        int score = game.getMaxScore("abcddcbd");

        assertEquals(score, 3);
    }

}