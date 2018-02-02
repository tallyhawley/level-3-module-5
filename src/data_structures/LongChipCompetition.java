package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	static ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
	
	public static void main(String[] args) {
		Beatle error = new Beatle("error");
		Beatle longest = error;
		int max = 0;
		for(Beatle beatle : theBeatles) {
			ArrayList<Chip> chips = beatle.getChips();
			for(Chip chip : chips) {
				if(chip.getLength() >= max) {
					max = (int) chip.getLength();
					longest = beatle;
				}
			}
		}
		System.out.println("the longest chip is " + max + " long and is owned by " + longest.getName());
	}
}