package main.java.chuck;

public class ChuckALuckSpel
{
    private Dobbelbeker beker;
    private int aantalNGelijk;
    private int saldo;
    private int ronde = 0;
    private int geluksgetal;

    public ChuckALuckSpel(int beginsaldo)
    {
        this.saldo = beginsaldo;
        beker = new Dobbelbeker(3, 6);
    }

    public void speelRonde(int geluksgetal, int inzet)
    {
        this.geluksgetal = geluksgetal;
        ronde++;

        aantalNGelijk = beker.nKeerGetalGeworpen(geluksgetal);
        if (aantalNGelijk > 0)
        {
            verrekenWinst(inzet);
        }
        else
        {
            saldo = saldo - inzet;
        }

        beker.totaalNKeerGeworpen = 0;
    }

    private void verrekenWinst(int inzet)
    {
        switch (aantalNGelijk)
        {
            case 1:
                saldo = inzet + saldo;
                break;
            case 2:
                saldo = inzet * 2 + saldo;
                break;
            case 3:
                saldo = inzet * 10 + saldo;
                break;
        }
    }

    public String toString()
    {
        return "-------------------------\n" + "ronde: " + ronde + "\n" + "geluksgetal: " + geluksgetal + "\n"
                + "worp: " + beker + "\n" + "saldo: " + saldo;
    }
}
