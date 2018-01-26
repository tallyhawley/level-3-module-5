package data_structures;

import java.util.Random;

public class Randomness {
	public static int num() {
		return new Random().nextInt(9) +1;
	}
	
	public static boolean bool() {
		return new Random().nextBoolean();
	}
}
