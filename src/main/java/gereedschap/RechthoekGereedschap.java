package main.java.gereedschap;

public class RechthoekGereedschap implements IGereedschap {
    @Override
    public void pasGereedschapToe(TekenApp app) {
        Rechthoek r = new Rechthoek(app.mouseX, app.mouseY, 50, 50);
        app.getFigurenLijst().add(r);
    }
}
