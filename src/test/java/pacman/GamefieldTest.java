package pacman;

import junit.framework.TestCase;
import pacman.Gamefield.Direction;

public class GamefieldTest extends TestCase {
    
    public void test1x1FieldWithPacmanLeft() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        gamefield.addPacman(0, 0, Direction.LEFT);
        assertEquals(">\n", gamefield.render());
    }
    
    public void test1x1FieldWithPacmanRight() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        gamefield.addPacman(0, 0, Direction.RIGHT);
        assertEquals("<\n", gamefield.render());
    }
    
    public void test1x1FieldWithPacmanUp() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        gamefield.addPacman(0, 0, Direction.UP);
        assertEquals("Λ\n", gamefield.render());
    }
    
    public void test1x1FieldWithPacmanDown() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        gamefield.addPacman(0, 0, Direction.DOWN);
        assertEquals("V\n", gamefield.render());
    }

    public void test1x2FieldWithPacmanLeft() throws Exception {
        Gamefield gamefield = new Gamefield(1, 2);
        gamefield.addPacman(0, 0, Direction.LEFT);
        assertEquals("> \n", gamefield.render());
    }
}