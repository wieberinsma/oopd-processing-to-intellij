package main.java.dieren;

public class Asiel
{
    public static void main(String[] args)
    {
        Dier dier1 = new Dier("Canine");
        Dier dier2 = new Zoogdier("Canine", 2);
        Dier dier3 = new Hond("Canine", 2, "Fiffie");

        Zoogdier zoogdier2 = new Zoogdier("Canine", 3);
        Zoogdier zoogdier3 = new Hond("Canine", 3, "Brutus");

        Hond hond3 = new Hond("Canine", 4, "Pluto");
        Hond hond4 = new Hond("Canine", 4, "Goofy");
        
        hond3.adem();
        dier1.adem();
        zoogdier2.adem();
    }
}
