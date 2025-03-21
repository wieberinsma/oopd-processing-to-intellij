package main.java.knoppen;

import processing.core.PApplet;

import java.util.ArrayList;

public class KnoppenApp extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("main.java.knoppen.KnoppenApp");
    }

    private Licht licht;

    private final ArrayList<Knop> knoppen = new ArrayList<>();

    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        licht = new Licht(this);

        knoppen.add(new LichtKnop(this, licht, 20, 20, 50, 50));
        knoppen.add(new LichtSwitch(this, licht, 100, 100, 40, 20));
    }

    public void draw()
    {
        licht.tekenLicht();
        for (Knop k : knoppen)
        {
            k.tekenKnop();
        }
    }

    public void mousePressed()
    {
        for (Knop k : knoppen)
        {
            if (k.isMuisOverKnop())
            {
                k.handelInteractieAf();
            }
        }
    }
}