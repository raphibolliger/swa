/*
 * Created on 22.02.2015
 */
package kw9.liskov.rectisasquare;

/**
 * @author Wolfgang Weck
 */
public class Rectangle extends Square {
	private int heigth;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width);
		this.heigth = height;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}


}
