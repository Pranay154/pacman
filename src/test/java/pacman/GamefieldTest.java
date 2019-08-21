package pacman;

import junit.framework.TestCase;
import pacman.Gamefield.Direction;

public class GamefieldTest extends TestCase {
    
    public void test1x1FieldWithPacmanLeft() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        Pacman pacman = new Pacman(0, 0, Direction.LEFT);
        gamefield.addPacman(pacman);
        assertEquals(">\n", gamefield.render());
    }
    
    public void test1x1FieldWithPacmanRight() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        Pacman pacman = new Pacman(0, 0, Direction.RIGHT);
        gamefield.addPacman(pacman);
        assertEquals("<\n", gamefield.render());
    }
    
    public void test1x1FieldWithPacmanUp() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        Pacman pacman = new Pacman(0, 0, Direction.UP);
        gamefield.addPacman(pacman);
        assertEquals("Λ\n", gamefield.render());
    }
    
    public void test1x1FieldWithPacmanDown() throws Exception {
        Gamefield gamefield = new Gamefield(1, 1);
        Pacman pacman = new Pacman(0, 0, Direction.DOWN);
        gamefield.addPacman(pacman);
        assertEquals("V\n", gamefield.render());
    }

    public void test1x2FieldWithPacmanLeft() throws Exception {
        Gamefield gamefield = new Gamefield(1, 2);
        Pacman pacman = new Pacman(0, 0, Direction.LEFT);
        gamefield.addPacman(pacman);
        assertEquals("> \n", gamefield.render());
    }
}