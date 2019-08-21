package pacman;

public class Scoreboard {
    private int score = 0;
    private int health = 3;

    public Scoreboard(){

    }

    public Scoreboard(int score, int health){
        this.score = score;
        this.health = health;
    }

    public int getScore(){
        return score;
    }

    public void incrementScore(int scoreToAdd){
        score += scoreToAdd;
    }

    public int getHealth(){
        return health;
    }

    public void decrementHealth(){
        health -= 1;
    }       

    @Override
    public String toString(){
        return "Health: " + this.health + "  Score: " + this.score ;
    }

}