package main.java.gereedschap;

public class CirkelGereedschap implements IGereedschap {
    @Override
    public void pasGereedschapToe(TekenApp app) {
        Cirkel c = new Cirkel(app.mouseX, app.mouseY, 50);
        app.getFigurenLijst().add(c);
    }
}