import java.util.Scanner;
public class MovieDriver {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		Movie newMovie = new Movie();
		System.out.println("Enter the name of a movie");
		String movieTitle = myScanner.nextLine();
		newMovie.setTitle(movieTitle);

		System.out.println("Enter the rating of a movie");
		String movieRating = myScanner.nextLine();
		newMovie.setRating(movieRating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets = myScanner.nextInt();
		newMovie.setSoldTickets(tickets);
		System.out.println(newMovie.toString());
		
		
	}
}
