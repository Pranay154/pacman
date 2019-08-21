package pacman;

public class Gamefield {
    private int height;
    private int width;

    private int pacmanY;
    private int pacmanX;
    private Direction pacmanDirection;

    enum Direction {
        LEFT,
        RIGHT,
        UP,
        DOWN
    } 
    
    public Gamefield(int height, int width){
        this.height = height;
        this.width = width;   
    }

    public void addPacman(int y, int x, Direction direction) {
        pacmanY = y;
        pacmanX = x;
        pacmanDirection = direction;
    }
    
    public String render() {
        char[][] gamefield = new char[height][width];
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                gamefield[y][x] = ' ';
            }
        }

        switch(pacmanDirection) {
            case LEFT:
                gamefield[pacmanY][pacmanX] = '>';
                break;
            case RIGHT:
                gamefield[pacmanY][pacmanX] = '<';
                break;
            case UP:
                gamefield[pacmanY][pacmanX] = 'Λ';
                break;
            case DOWN:
                gamefield[pacmanY][pacmanX] = 'V';
                break;
            default:
                gamefield[pacmanY][pacmanX] = '*';
                break;
        }
        String result = "";
        for(char[] row : gamefield) {
            result += new String(row) + "\n";
        }
        return result;
    }
}