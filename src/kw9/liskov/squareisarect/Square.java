/*
 * Created on 22.02.2015
 */
package kw9.liskov.squareisarect;

/**
 * @author Wolfgang Weck
 */
public class Square extends Rectangle {
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}
