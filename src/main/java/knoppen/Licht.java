package main.java.knoppen;

import processing.core.PApplet;

public class Licht
{
    private final PApplet app;
    private int kleur;

    public Licht(PApplet app)
    {
        this.app = app;
        kleur = 0;
    }

    void schakelLicht()
    {
        kleur = (kleur == 0 ? 0xFFA4C739 : 0);
    }

    public void tekenLicht()
    {
        app.background(kleur);
    }
}
