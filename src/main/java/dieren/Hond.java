package main.java.dieren;

public class Hond extends Zoogdier
{
    protected String naam;
    protected String engelseVertaling = "Dog";

    public Hond(String soort, int draagTijd, String naam)
    {
        super(soort, draagTijd);
        this.naam = naam;
    }

    public void blaf()
    {
        System.out.println("waf waf");
    }

    @Override
    public String toString()
    {
        return "Hond";
    }
}
