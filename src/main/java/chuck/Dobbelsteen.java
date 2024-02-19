package main.java.chuck;

import java.util.Random;

public class Dobbelsteen
{
    private Random worpRandomizer;
    private int aantalZijden;
    private int aantalOgen;

    public Dobbelsteen(int aantalZijden)
    {
        worpRandomizer = new Random();

        if (aantalZijden >= 2)
        {
            this.aantalZijden = aantalZijden;
        }
        else
        {
            System.out.println("Aantal zijden mag niet minder zijn dan 2");
        }
    }

    public boolean isGetalGegooid(int getal)
    {
        werpSteen();
        return aantalOgen == getal;
    }

    private void werpSteen()
    {
        this.aantalOgen = worpRandomizer.nextInt(aantalZijden) + 1;
    }

    public String toString()
    {
        return "" + aantalOgen;
    }
}
