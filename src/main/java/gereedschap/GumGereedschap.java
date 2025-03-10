package main.java.gereedschap;

public class GumGereedschap implements IGereedschap {
    @Override
    public void pasGereedschapToe(TekenApp app) {
        for (int i = app.getFigurenLijst().size() - 1; i >= 0; i--) {
            Figuur fig = app.getFigurenLijst().get(i);
            if (fig.isMuisBinnen(app.mouseX, app.mouseY, app)) {
                app.getFigurenLijst().remove(i);
            }
        }
    }
}