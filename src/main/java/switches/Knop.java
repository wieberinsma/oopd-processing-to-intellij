package main.java.switches;

import processing.core.PApplet;

import java.util.ArrayList;

public abstract class Knop
{
    protected PApplet app;

    protected float x, y, breedte, hoogte;

    protected ArrayList<IDoelwit> doelwitten = new ArrayList<IDoelwit>();

    public Knop(PApplet app, float x, float y, float breedte, float hoogte)
    {
        this.app = app;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public boolean isMuisOverKnop()
    {
        return app.mouseX >= x && app.mouseX < x + breedte && app.mouseY >= y && app.mouseY < y + hoogte;
    }

    public abstract void tekenKnop();

    public void handelInteractieAf()
    {
        doeKnopActie();
    }

    public void doeKnopActie()
    {
        for (IDoelwit doelwit : doelwitten)
        {
            doelwit.schakel();
        }
    }

    public void voegDoelwitToe(IDoelwit doelwit)
    {
        doelwitten.add(doelwit);
    }
}
