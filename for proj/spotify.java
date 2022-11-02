import java.util.*;

public class Spotify {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Queue_Linkedlist music = new Queue_Linkedlist();

		while (true) {
			System.out.print("Enter your choice: ");
			String choice = input.nextLine();
			if (choice.equalsIgnoreCase("insert")) {
				System.out.print("Insert a Song: ");
				String song = input.nextLine();
				music.enqueue(song);
			} else if (choice.equalsIgnoreCase("back")) {
				music.dequeue();

			} else if (choice.equalsIgnoreCase("display")) {
				music.display();

			} else if (choice.equalsIgnoreCase("peek")) {
				music.peek();
			}

		}
	}
}
