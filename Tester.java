public class Tester{



	public static void main(String[] args){


		FileRead FR = new FileRead("tmdb_5000_credits.csv");

		Graph test = FR.read();

		System.out.println(test.findPath("Will Smith", "Kevin Bacon"));


	}
}