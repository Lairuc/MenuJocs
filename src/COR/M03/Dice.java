package COR.M03;

import static java.lang.Math.random;

public class Dice {
    private int cares = 6;

    protected void setCares(int cares) { this.cares = cares; }
    protected int getCares() { return this.cares; }

    public void Dau(){}
    public void Dau(int cares){ this.cares = cares; }
    private int roll() {
        return (int) ( random()*(cares - 1) +1);
    }
    private int[] roll(int vegades) {
        int[] resultats = new int[0];
        for (int i = 0; i < vegades; i++) {
            resultats[i] = this.roll();
        }
        return resultats;
    }
}
