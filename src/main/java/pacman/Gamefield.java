package pacman;

public class Gamefield {
    private int height;
    private int width;

    private Pacman pacman;

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

    public void addPacman(Pacman pacman) {
        this.pacman = pacman;
    }
    
    public String render() {
        char[][] gamefield = new char[height][width];
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                gamefield[y][x] = ' ';
            }
        }

        gamefield[pacman.getY()][pacman.getX()] = pacman.render();

        String result = "";
        for(char[] row : gamefield) {
            result += new String(row) + "\n";
        }
        return result;
    }
}