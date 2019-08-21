package pacman;

public class Game {
    private int height;
    private int width;

    Scoreboard scoreboard = new Scoreboard();
    
    public Game(){

    }

    public Game(int height, int width){
        
    }

    public Scoreboard getScoreboardScore(){
        return scoreboard;
    }

    
}