package main.java.dieren;

public class Zoogdier extends Dier
{
    protected int draagTijd;
    protected String engelseVertaling = "Mammal";

    public Zoogdier(String soort, int draagTijd)
    {
        super(soort);
        this.draagTijd = draagTijd;
    }

    @Override
    public void adem()
    {
        super.adem();
    }

    public void zoog()
    {
        System.out.println("zoog");
    }

    @Override
    public String toString()
    {
        return "Zoogdier";
    }
}
