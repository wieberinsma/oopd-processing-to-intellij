package main.java.chuck;

public class Dobbelbeker
{
    private Dobbelsteen dobbelstenen[];
    int totaalNKeerGeworpen = 0;

    public Dobbelbeker(int aantalDobbelstenen, int aantalZijden)
    {
        dobbelstenen = new Dobbelsteen[aantalDobbelstenen];

        for (int i = 0; i < dobbelstenen.length; i++)
        {
            dobbelstenen[i] = new Dobbelsteen(aantalZijden);
        }
    }

    public int nKeerGetalGeworpen(int getal)
    {
        for (int i = 0; i < dobbelstenen.length; i++)
        {
            if (dobbelstenen[i].isGetalGegooid(getal))
            {
                totaalNKeerGeworpen++;
            }
        }
        return totaalNKeerGeworpen;
    }

    public String toString()
    {
        String ogen = "";

        for (int i = 0; i < dobbelstenen.length; i++)
        {
            ogen = ogen + dobbelstenen[i];
            if (ogen != "")
            {
                ogen = ogen + " ";
            }
        }

        return ogen;
    }
}
