package pacman;

import pacman.Gamefield.Direction;

public class Pacman {
    private int y;
    private int x;
    private Direction direction;

    public Pacman(int y, int x, Direction direction) {
        this.y = y;
        this.x = x;
        this.direction = direction;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public char render() {
        switch(direction) {
            case LEFT:
                return '>';
            case RIGHT:
                return '<';
            case UP:
                return 'Λ';
            case DOWN:
                return 'V';
            default:
                return '*';
        }
    }
}
