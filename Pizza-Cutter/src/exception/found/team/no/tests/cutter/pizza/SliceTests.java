package exception.found.team.no.tests.cutter.pizza;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exception.found.team.no.cutter.pizza.Slice;

public class SliceTests {
    @Test
    public void testSliceCreation() {
	Slice slice = new Slice();
	assertNotNull(slice);
    }

    @Test
    public void testSliceXY1() {
	Slice slice = new Slice();
	int x = 10;
	int y = 10;
	slice.setX(x);
	slice.setY(y);

	assertTrue(slice.getX() == x);
	assertTrue(slice.getY() == y);
    }

    @Test
    public void testSliceXY2() {
	Slice slice = new Slice();
	int x = 5;
	int y = 2;
	slice.setX(x);
	slice.setY(y);

	assertTrue(slice.getX() == x);
	assertTrue(slice.getY() == y);
    }
}
