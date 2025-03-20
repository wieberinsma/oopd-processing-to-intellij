package main.java.dieren;

public class Dier
{
    protected String soort;
    protected String engelseVertaling = "Animal";

    public Dier(String soort)
    {
        this.soort = soort;
    }

    public void adem()
    {
        if (this instanceof Zoogdier)
        {
            ((Hond) this).zoog();
        } else
        {
            System.out.println("adem in/adem uit");
        }
    }

    private void slapen()
    {
        System.out.println("slapen");
    }

    public String toString()
    {
        return "Dier";
    }
}
