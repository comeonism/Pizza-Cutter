package exception.found.team.no.tests.cutter.pizza;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exception.found.team.no.cutter.pizza.Cell;

public class CellTests {
    @Test
    public void testCellNotNull() {
	Cell cell = new Cell("tomato");
	assertNotNull(cell);
    }

    @Test
    public void testCellWithTomato() {
	Cell cell = new Cell("tomato");
	assertTrue("tomato".equalsIgnoreCase(cell.getTopping()));
    }

    @Test
    public void testCellWithMushroom() {
	Cell cell = new Cell("mushroom");
	assertFalse("tomato".equalsIgnoreCase(cell.getTopping()));
	assertTrue("mushroom".equalsIgnoreCase(cell.getTopping()));
    }

    @Test
    public void testCellUnclaimed() {
	Cell cell = new Cell("mushroom");
	assertFalse(cell.isClaimed());
    }

    @Test
    public void testCellClaimed() {
	Cell cell = new Cell("mushroom");
	cell.setClaimed(true);
	assertTrue(cell.isClaimed());
    }

    @Test
    public void testCellUnclaimed2() {
	Cell cell = new Cell("mushroom");
	cell.setClaimed(true);
	cell.setClaimed(false);
	assertFalse(cell.isClaimed());
    }
}
