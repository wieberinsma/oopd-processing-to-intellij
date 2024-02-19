package main.java.klok;

import processing.core.PApplet;

public class KlokApp extends PApplet
{
    private Klok deKlok;

    public static void main(String[] args)
    {
        PApplet.main("main.java.klok.KlokApp");
    }

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        background(0);
        deKlok = new Klok(150, 100, 200, this);
        deKlok.setTijd(23, 59);
    }

    public void draw()
    {
        deKlok.tik();
        deKlok.tekenKlok();
    }
}
