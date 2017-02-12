package exception.found.team.no.cutter.pizza;

import java.awt.Point;

public class Slice {
    private int width;
    private int height;
    private int tomatoes;
    private int mushrooms;
    private Point startPosition;

    public Slice(int x, int y) {
	tomatoes = 0;
	mushrooms = 0;
	width = 1;
	height = 1;
	startPosition = new Point(x, y);
    }

    public Point getStartPos() {
	return startPosition;
    }

    public int getX() {
	return startPosition.x;
    }

    public int getY() {
	return startPosition.y;
    }

    public void setWidth(int width) {
	this.width = width;
    }

    public int getWidth() {
	return width;
    }

    public void setHeight(int height) {
	this.height = height;
    }

    public int getHeight() {
	return height;
    }

    public void addTomato() {
	tomatoes++;
    }

    public int getTomatoes() {
	return tomatoes;
    }

    public void addMushroom() {
	mushrooms++;
    }

    public int getMushrooms() {
	return mushrooms;
    }

    public int getCells() {
	return width * height;
    }

    public void incrementWidth() {
	width++;
    }

    public void incrementHeight() {
	height++;
    }
}
