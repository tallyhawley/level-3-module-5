package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class BandNameGenerator {
	static ArrayList<String> part1 = new ArrayList<String>();
	static ArrayList<String> part2 = new ArrayList<String>();
	
	public static void main(String[] args) {
		Random generator = new Random();
		setup();
		int index1 = generator.nextInt(part1.size());
		int index2 = generator.nextInt(part2.size());
		System.out.println(part1.get(index1) + " "+ part2.get(index2));
	}
	
	static void setup() {
		part1.add("legendary");
		part1.add("stinky");
		part1.add("theoretically improbable");
		part1.add("exploding");
		part1.add("ironic");
		part1.add("disastrous");
//		part1.add("kinky");
		part1.add("smackable");
		part1.add("cronchy");
		part1.add("iconic");
		part1.add("explicit");
		part1.add("swaggy");
		part1.add("peng");
		part1.add("scrumptious");
		part1.add("stormi");
		part1.add("kafka-esque");
		part1.add("high quality");
		part1.add("wonky");
		part1.add("soft");
		part1.add("pissign");
		part1.add("meaningless");
		part1.add("headass");
		part1.add("broke-ass");
		part1.add("annoyign");
		part1.add("soulja");
		part1.add("dumbass");
		part1.add("dancing");
		part1.add("legend");
		part1.add("gay");
		
//		part2.add("legends");
		part2.add("jesus");
//		part2.add("worms");
//		part2.add("icons");
//		part2.add("bugs");
//		part2.add("visuals");
//		part2.add("moods");
//		part2.add("beastiality");
//		part2.add("bitches");
//		part2.add("babies");
//		part2.add("heretics");
//		part2.add("sunshines");
//		part2.add("gays");
	}
}
