package data_structures;

public class Snake {
	int viciousness;
	boolean venomous;
	
	public Snake() {
		this.viciousness = Randomness.num();
		this.venomous = Randomness.bool();
	}

	public int getViciousness() {
		return viciousness;
	}

	public boolean isVenomous() {
		return venomous;
	}

	
}
