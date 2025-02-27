package main.java;

public enum Maat
{
    XS("kleinste"),
    S("klein"),
    M("middelste"),
    L("groot"),
    XL("grootst");

    final String omschrijving;

    Maat(String omschrijving)
    {
        this.omschrijving = omschrijving;
    }

    String getOmschrijving()
    {
        return this.omschrijving;
    }
}
