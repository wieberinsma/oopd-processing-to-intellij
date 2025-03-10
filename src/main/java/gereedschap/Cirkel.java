package main.java.gereedschap;

import processing.core.PApplet;

public class Cirkel extends Figuur {
    private float diameter;

    public Cirkel(float x, float y, float diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public void teken(TekenApp app) {
        super.teken(app);
        app.ellipse(x, y, diameter, diameter);
    }

    public boolean isMuisBinnen(float x, float y, TekenApp app) {
    	return PApplet.dist(this.x, this.y, app.mouseX, app.mouseY) < diameter/2;
    }
}
