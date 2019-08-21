package pacman;

import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
    public void testScoreboardIsZero() throws Exception{
        Scoreboard s = new Scoreboard();
        assertEquals(0, s.getScore());
    }

    public void testIncrementingScoreboard() throws Exception{
        Scoreboard s = new Scoreboard();
        s.incrementScore(1);
        assertEquals(1, s.getScore());
    }

    public void testScoreboardHealth() throws Exception {
        Scoreboard s = new Scoreboard();
        assertEquals(3, s.getHealth());
    }

    public void testDecrementingHealth() throws Exception{
        Scoreboard s = new Scoreboard();
        s.decrementHealth();
        assertEquals(2, s.getHealth());
    }

    public void testScoreboardDisplayFormat() throws Exception{
        Scoreboard s = new Scoreboard();
        assertEquals("Health: 3  Score: 0", s.toString());
    }
}