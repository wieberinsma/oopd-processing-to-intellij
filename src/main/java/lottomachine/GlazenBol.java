package main.java.lottomachine;

import java.util.ArrayList;
import java.util.Random;

public class GlazenBol
{
    private ArrayList<Lottobal> ballen;

    GlazenBol()
    {
        ballen = new ArrayList<>();
    }

    public void verzamelAlleBallen()
    {
        for (int i = 1; i < 46; i++)
        {
            ballen.add(new Lottobal(i));
        }
    }

    public Lottobal schepBal()
    {
        Lottobal bal = null;

        if (!ballen.isEmpty())
        {
            Random rand = new Random();
            bal = ballen.get(rand.nextInt(ballen.size()));
            ballen.remove(bal);
        }

        return bal;
    }
}
