package main.java.knoppen;

import processing.core.PApplet;

public abstract class Knop
{
    protected PApplet app;

    protected float x, y, breedte, hoogte;

    public Knop(PApplet app, float x, float y, float breedte,
            float hoogte)
    {
        this.app = app;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public void tekenKnop()
    {
        app.stroke(95);
        app.fill(80);
        app.rect(x, y, breedte, hoogte);
    }

    public boolean isMuisOverKnop()
    {
        return app.mouseX >= x && app.mouseX < x + breedte &&
                app.mouseY >= y && app.mouseY < y + hoogte;
    }

    public void handelInteractieAf()
    {
        doeKnopActie();
    }

    protected abstract void doeKnopActie();

}
