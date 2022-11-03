import java.util.*;

public class Spotify {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Queue_Linkedlist music = new Queue_Linkedlist();

			System.out.println("Welcome to the Music App");
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
