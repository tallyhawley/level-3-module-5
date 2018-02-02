package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
		static ArrayList<String> fridge = new ArrayList<String>();
		
		public static void main(String[] args) {
			fridge.add("eggs");
			fridge.add("pasta");
			fridge.add("broccoli");
			fridge.add("penicillin");
			fridge.add("literal rat poison");
			System.out.println("you should eat " + whatFood() + " tonight");
		}
		
		public static String whatFood() {
			int index = new Random().nextInt(fridge.size());
			return fridge.get(index);
		}
}
