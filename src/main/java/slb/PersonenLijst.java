package main.java.slb;

import java.util.ArrayList;

public class PersonenLijst
{
    private ArrayList<Persoon> lijst;

    public PersonenLijst()
    {
        lijst = new ArrayList<>();
    }

    public static void main(String[] args)
    {
        PersonenLijst p = new PersonenLijst();

        Docent piet = new Docent("Piet", "Jansen", "jnsnp");

        Student marie = new Student("Marie", "Pieters", 31415, piet);

        Student sarah = new Student("Sarah", "Klaassen", 34580, piet);

        Student jan = new Student("Jan", "de Vries", 92653, null); // nog geen SLB'er

        p.lijst.add(piet);

        p.lijst.add(marie);
        p.lijst.add(sarah);

        p.lijst.add(jan);

        // voeg zelf nog enkele docenten en studenten toe

        ArrayList<Persoon> studentenVanPiet = p.getSLBStudenten(piet);
        System.out.println(studentenVanPiet);
    }

    public ArrayList<Persoon> getSLBStudenten(Docent SLBer)
    {
        ArrayList<Persoon> studenten = new ArrayList<>();

        for (Persoon persoon : lijst)
        {
            Docent studentSLBer = persoon.getSLBer();
            if (studentSLBer != null && studentSLBer.equals(SLBer))
            {
                studenten.add(persoon);
            }
        }

        return studenten;
    }
}
