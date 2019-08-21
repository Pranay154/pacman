package pacman;

import junit.framework.TestCase;

public class Gametest extends TestCase {
    
    public void testNewGameScoreboard() throws Exception{
        Game g = new Game();
        int score = g.getScoreboardScore().getScore();
        int health = g.getScoreboardScore().getHealth();
        assertEquals(0, score);
        assertEquals(3, health);
    }

    // public void testEmptyGameboard() throws Exception{
    //     Game g = new Game(2, 2);
    //     int[][] expectedGameboard =  
    // }
}