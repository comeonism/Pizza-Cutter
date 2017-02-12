package exception.found.team.no.tests.cutter.pizza;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

import exception.found.team.no.cutter.pizza.Slice;

public class SliceTests {
    @Test
    public void testSliceCreation() {
	Slice slice = new Slice(0, 0);
	assertNotNull(slice);
    }

    @Test
    public void testSliceXY1() {
	int x = 10;
	int y = 10;
	Slice slice = new Slice(x, y);

	assertTrue(slice.getX() == x);
	assertTrue(slice.getY() == y);
    }

    @Test
    public void testSliceXY2() {
	int x = 5;
	int y = 2;

	Slice slice = new Slice(x, y);

	assertTrue(slice.getX() == x);
	assertTrue(slice.getY() == y);
    }

    @Test
    public void testSliceWidth1() {
	Slice slice = new Slice(0, 0);
	int width = 2;
	slice.setWidth(width);

	assertTrue(slice.getWidth() == width);
    }

    @Test
    public void testSliceWidth2() {
	Slice slice = new Slice(0, 0);
	int width = 5;
	slice.setWidth(width);

	assertTrue(slice.getWidth() == width);
    }

    @Test
    public void testSliceHeight1() {
	Slice slice = new Slice(0, 0);
	int height = 4;
	slice.setHeight(height);

	assertTrue(slice.getHeight() == height);
    }

    @Test
    public void testSliceHeight2() {
	Slice slice = new Slice(0, 0);
	int height = 13;
	slice.setHeight(height);

	assertTrue(slice.getHeight() == height);
    }

    @Test
    public void testGet1Tomato() {
	Slice slice = new Slice(0, 0);
	slice.addTomato();

	assertTrue(slice.getTomatoes() == 1);
    }

    @Test
    public void testGet2Tomatoes() {
	Slice slice = new Slice(0, 0);
	slice.addTomato();
	slice.addTomato();

	assertTrue(slice.getTomatoes() == 2);
    }

    @Test
    public void testGet1Mushroom() {
	Slice slice = new Slice(0, 0);
	slice.addMushroom();

	assertTrue(slice.getMushrooms() == 1);
    }

    @Test
    public void testGetMushrooms() {
	Slice slice = new Slice(0, 0);
	slice.addMushroom();
	slice.addMushroom();
	slice.addMushroom();
	slice.addMushroom();

	assertTrue(slice.getMushrooms() == 4);
    }

    @Test
    public void testSliceCells1() {
	Slice slice = new Slice(2, 1);
	slice.addMushroom();

	assertTrue(slice.getCells() == 1);
    }

    @Test
    public void testSliceCells2() {
	Slice slice = new Slice(0, 0);
	slice.addMushroom();
	slice.addMushroom();
	slice.incrementWidth();
	slice.addTomato();
	slice.incrementWidth();

	assertTrue(slice.getCells() == 3);
    }

    @Test
    public void testSliceCells3() {
	Slice slice = new Slice(0, 0);
	slice.addMushroom();
	slice.addMushroom();
	slice.incrementWidth();
	slice.addTomato();
	slice.incrementHeight();

	// dealing with rectangles, not weird shapes,
	// that's why this doesn't return 3, instead the logic
	// of rectangularly adding cells should be external to Slice
	assertFalse(slice.getCells() == 3);
    }

    @Test
    public void testSliceCells4() {
	Slice slice = new Slice(0, 0);
	slice.addTomato();
	slice.addMushroom();
	slice.incrementWidth();
	slice.addTomato();
	slice.incrementWidth();

	assertTrue(slice.getCells() == 3);
    }

    @Test
    public void testSliceStartPos() {
	Slice slice = new Slice(0, 0);

	assertTrue(slice.getStartPos().x == new Point(0, 0).x);
	assertTrue(slice.getStartPos().y == new Point(0, 0).y);
    }

    @Test
    public void testSliceStartPos2() {
	Slice slice = new Slice(1, 2);

	assertTrue(slice.getStartPos().x == new Point(1, 2).x);
	assertTrue(slice.getStartPos().y == new Point(1, 2).y);
    }
}
