package main.java.school;

import java.util.Random;

public class SchoolApp
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Student s1 = new Student("persoon 1");

        for (int i = 0; i < 8; i++)
        {
            s1.setCijfer(i, r.nextInt(10) + 1);
        }

        System.out.println(s1);
        System.out.println(StudieAdviseur.krijgtPositiefStudieadvies(s1));
        System.out.println("------------------");
    }
}
