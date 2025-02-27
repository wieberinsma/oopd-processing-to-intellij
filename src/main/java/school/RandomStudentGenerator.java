package main.java.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStudentGenerator
{
    private final List<Student> studentenLijst;

    RandomStudentGenerator() {
        studentenLijst = new ArrayList<>();
    }

    public void genereerStudenten(int aantal)
    {
        Random generator = new Random();

        for (int i = 0; i < aantal; i++)
        {
            studentenLijst.add(new Student("persoon_" + i));
            for (int j = 0; j < 8; j++)
            {
                studentenLijst.get(i).setCijfer(j, generator.nextInt(10) + 1);
            }
        }
    }

    public List<Student> getStudentenLijst()
    {
        return studentenLijst;
    }
}
