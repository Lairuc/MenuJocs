package COR.M03;

public class Player {
    private String name = "New Player";
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }
    public Player() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int addScore(int score) {
        this.score += score;
        return this.score;
    }
    public void resetScore() { this.score=0; }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
