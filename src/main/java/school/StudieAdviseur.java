package main.java.school;

public class StudieAdviseur
{
    public static boolean krijgtPositiefStudieadvies(Student s)
    {
        int aantalGroterOfGelijkAanZes = 0;

        for (int cijfer : s.getCijfers())
        {
            if (cijfer >= 6)
            {
                aantalGroterOfGelijkAanZes++;
            }
        }

        return aantalGroterOfGelijkAanZes >= 4;
    }
}
