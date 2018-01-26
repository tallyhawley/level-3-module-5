package data_structures;

import java.util.ArrayList;

public class Plane {
		static int passengers = 25;
		static ArrayList<Snake> snakes = new ArrayList<Snake>();
		static int totalVenom =0;
		
		public static void main(String[] args) {
			for(int i=0; i<100;i++) {
				Snake snake = new Snake();
				snakes.add(snake);
			}
			for(Snake snake : snakes) {
				if(snake.venomous) {
					totalVenom += snake.viciousness;
				}
			}
			int chanceofDeath = (totalVenom*10)/passengers;
			System.out.println(chanceofDeath + "% chance of death");
		}
}
