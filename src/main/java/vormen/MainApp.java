package main.java.vormen;

import processing.core.PApplet;

public class MainApp extends PApplet
{
    public static void main(String[] args)
    {
        Vierkant vierkant = new Vierkant(10);
        Rechthoek rechthoek = new Rechthoek(10, 20);

        int opp = vierkant.calculateSurfaceArea(vierkant.side, vierkant.side);
        int opp2 = rechthoek.calculateSurfaceArea(rechthoek.width, rechthoek.height);

        System.out.println(opp + ", " + opp2);
    }
}
