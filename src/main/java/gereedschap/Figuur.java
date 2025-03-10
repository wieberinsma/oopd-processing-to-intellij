package main.java.gereedschap;

public abstract class Figuur {
    protected float x, y;

    public Figuur(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void teken(TekenApp app) {

    }

    public boolean isMuisBinnen(float x, float y, TekenApp app) {
        return false;
    }
}
