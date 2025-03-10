package main.java.radio;
import processing.core.PApplet;

import java.util.Objects;

public class Tekstraam implements IDoelwit {
	
	PApplet app;
	String tekst;
	float x;
	float y;

	public Tekstraam(PApplet app, String tekst, float x, float y) {
		this.app = app;
		this.tekst = tekst;
		this.x = x;
		this.y = y;
	}

	@Override
	public void schakel() {
		if (Objects.equals(tekst, "OOPD")) {
			tekst = "SAQ";
		}
		else {
			tekst = "OOPD";
		}
	}

	public void teken() {
		app.text(tekst, x, y);
	}
	
}
