package exception.found.team.no.cutter.pizza;

public class Cell {
    private String topping;
    private boolean claimed;

    public Cell(String topping) {
	if (Utils.TOMATO.equalsIgnoreCase(topping)) {
	    this.topping = Utils.TOMATO;
	} else {
	    this.topping = Utils.MUSHROOM;
	}

	claimed = false;
    }

    public String getTopping() {
	return topping;
    }

    public void setClaimed(boolean claimed) {
	this.claimed = claimed;
    }

    public boolean isClaimed() {
	return claimed;
    }
}
