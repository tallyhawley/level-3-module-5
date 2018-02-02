package data_structures;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ComedyCentral {
	static ArrayList<String> setups = new ArrayList<String>();
	static ArrayList<String> punchlines = new ArrayList<String>();

	public static void main(String[] args) {
		setup();
		int index = generateJoke();
		JOptionPane.showMessageDialog(null, setups.get(index));
		JOptionPane.showMessageDialog(null, punchlines.get(index));
	}

	static int generateJoke() {
		int index = new Random().nextInt(setups.size());

		return index;
	}

	static void setup() {
		setups.add("donald trump's not good at running for president. he's just good at family feud.\n"
				+ "and the other candidates are terrible at family feud. so when the steve harvey of\n"
				+ "this election is like, \"name something that's bothering americans!\" and ted cruz\n"
				+ "is like, \"benghazi!\" wrong!");
		punchlines.add("then trump is like, [terrible trump impression] \"all the problems.\" and that's\n"
				+ "the number one answer on the board.");
		setups.add("hello, chicago! nice to see you again! thank you, that was very nice, thank you.\n"
				+ "now, you're a wonderful crowd, but i need you to keep your energy up the whole show,\n"
				+ "okay? because, [applause] no, no, thank you, because some crowds... they have big\n"
				+ "energy in the beginning, and then they run out of places to go. and i don't judge\n"
				+ "those crowds, by the way, okay? we've all gone too big too fast and then run out of\n"
				+ "room. we've all made a happy birthday sign... you get that poster board up and you're\n"
				+ "like, \"i don't need to trace it. i know how big letters should be. a-to begin with,\n"
				+ "a big-ass 'h'! followed by a big-ass 'a', and- oh, no. oh, god. okay, alright. real\n"
				+ "skinny 'p' with a high hump, and then we'll put the second 'p' below the hump of that\n"
				+ "first 'p', kind of like a motorcycle-sidecar situation. and now i have no room for\n"
				+ "the 'y', so i'll do a kind of curled up noodle 'y'? 'cause block letters and cursive\n"
				+ "look good together.\"");
		punchlines.add("and then you go to write \"birthday\", and you completely forget the lesson you\n"
				+ "just learned with \"happy\"! you're like, \"yeah, but the past is the past. big-ass 'b'!\n"
				+ "surely more letters will fit in the Same space.\"");
		setups.add("where do cows go on friday evenings?");
		punchlines.add("the moo-vies!");
		setups.add("i used to think the brain was the most important organ.");
		punchlines.add("then i thought, look what's telling me that");
		setups.add("there's a midget fortune teller who just escaped from prison!");
		punchlines.add("they're a small medium at large.");
		setups.add("a blind man walks into a bar...");
		punchlines.add("and a table. and a chair.");
		setups.add("what did jay-z call his girlfriend when they got engaged?");
		punchlines.add("feyonce'");
		setups.add("me: hey do you take walk-ins");
		punchlines.add("the morgue: what");
		setups.add("professor x: what exactly is your mutant power?");
		punchlines.add("[i whisper \"it's not very good\" in his left ear but he hears it in his right ear]");
		setups.add("life hack: give your next child a normal name");
		punchlines.add("me: are you still mad that your mother and i named you life hack");
		setups.add("a poor man meets a rich man around christmas.\n"
				+ "the poor man asks the rich man, \"what are you getting your wife for christmas?\" the rich\n"
				+ "man replies, \"diamond earrings and a mercedes.\" the poor man asks, \"why are you getting\n"
				+ "her two gifts?\" the rich man says, \"well, if she doesn't like the earrings then she can\n"
				+ "drive to the store and exchange them.\"\n"
				+ "the poor man nods. then the rich man asks him, \"so, what are you getting your wife\n"
				+ "this year?\" the poor man thinks about it for a second then replies, \"a pair of slippers\n"
				+ "and a dildo.\"");
		punchlines.add("the rich man asks, \"why those two things?\" the poor man astutely responds, \"this\n"
				+ "way, if she doesn't like the slippers she can go fuck herself.\"");
		setups.add("helium walks into a bar and orders a water. the bartender says, \"sorry, we don't serve\n"
				+ "noble gases here.\"");
		punchlines.add("helium doesn't react.");
	}
}
