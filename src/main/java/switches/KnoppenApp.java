package main.java.switches;

import processing.core.PApplet;

import java.util.ArrayList;

public class KnoppenApp extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main(new String[]{"main.java.switches.KnoppenApp"});
    }

    private final ArrayList<Knop> knoppen = new ArrayList<>();

    private IDoelwit licht;
    private IDoelwit tekstraam;

    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        licht = new Licht(this);
        tekstraam = new Tekstraam(this, "OOPD", 250, 250);

        Switch eenSwitch = new Switch(this, 100, 20, 50, 50);

        eenSwitch.voegDoelwitToe(licht);
        eenSwitch.voegDoelwitToe(tekstraam);

        Switch eenTweedeSwitch = new Switch(this, 200, 50, 50, 50);
        eenTweedeSwitch.voegDoelwitToe(eenSwitch);

        eenSwitch.voegDoelwitToe(eenTweedeSwitch);

        knoppen.add(eenSwitch);
        knoppen.add(eenTweedeSwitch);
    }

    public void draw()
    {
        licht.teken();
        tekstraam.teken();
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
