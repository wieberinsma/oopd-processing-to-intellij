package main.java.lottomachine;

public class Lottobal
{
    private int nummer;

    public Lottobal(int nummer) {
        this.nummer = nummer;
    }

    public boolean isNummerGroterDan(Lottobal andereBal) {
        return nummer > andereBal.nummer;
    }

    public String toString() {
        return "" + nummer;
    }
}
