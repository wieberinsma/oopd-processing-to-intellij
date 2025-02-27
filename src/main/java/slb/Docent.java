package main.java.slb;

import java.util.Objects;

public class Docent extends Persoon
{
    protected String code;

    public Docent(String naam, String voornaam, String code)
    {
        super(naam, voornaam);
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    @Override
    public Docent getSLBer()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "Docent{" +
                "code='" + code + '\'' +
                ", naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o1)
    {
        if (!(o1 instanceof Docent o2)) return false;
        return Objects.equals(code, o2.code);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(code);
    }
}
