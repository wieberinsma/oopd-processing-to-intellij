package main.java.switches;

import processing.core.PApplet;

import java.util.Objects;

public class Tekstraam implements IDoelwit{

	private PApplet app;
	private String tekst;
	private int x;
	private int y;
	private boolean isActief = false;
	
	
	public Tekstraam(KnoppenApp knoppenApp, String tekst, int i, int j) {
		this.app = knoppenApp;
		this.tekst = tekst;
		this.x = i;
		this.y = j;
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

	@Override
	public void teken() {
		app.text(tekst, x, y);
	}
	
}
