package exception.found.team.no.cutter.pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PizzaCutter {
    private static Cell[][] pizza;

    private static int minToppings;
    private static int maxCells;

    public static void main(String[] args) {
	populate("resources/in/example.in");
    }

    private static void populate(String file) {
	try (Scanner scanner = new Scanner(new File(file))) {
	    int rows = scanner.nextInt();
	    int columns = scanner.nextInt();
	    pizza = new Cell[rows][columns];

	    minToppings = scanner.nextInt();
	    maxCells = scanner.nextInt();
	    scanner.nextLine();

	    int row = 0;

	    while (scanner.hasNextLine()) {
		String toppingRow = scanner.nextLine();

		for (int column = 0; column < columns; column++) {
		    if (toppingRow.charAt(column) == 't' || toppingRow.charAt(column) == 'T') {
			pizza[row][column] = new Cell(Utils.TOMATO);
		    } else {
			pizza[row][column] = new Cell(Utils.MUSHROOM);
		    }
		}

		row++;
	    }
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
