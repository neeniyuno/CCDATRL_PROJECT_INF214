import java.util.*;

import java.util.*;

public class MusicApp {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Queue_Linkedlist music = new Queue_Linkedlist();

			System.out.println("\n\nHello World, Welcome to the Music App!!");
			System.out.println("The Queue is currently empty. \nTo play some songs, please choose Insert to input a song.");
			System.out.println("To display the current queue, choose Display.");
			System.out.println("To see the current song playing, choose Peek.");
			System.out.println("If you wish to play the next song, choose Next and then Display to see the current queue, \nand Peek to see the current playing song.");
			System.out.println("Enjoy listening!!\n\n");
			while (true) {
				
				System.out.print("Enter your choice: ");
				String choice = input.nextLine();
				if (choice.equalsIgnoreCase("Insert")) {
					System.out.print("Insert a Song: ");
					String song = input.nextLine();
					music.enqueue(song);
				} else if (choice.equalsIgnoreCase("Next")) {
					music.dequeue();

				} else if (choice.equalsIgnoreCase("Display")) {
					music.display();

				} else if (choice.equalsIgnoreCase("Peek")) {
					music.peek();
				}

			}
		}
	}
}
