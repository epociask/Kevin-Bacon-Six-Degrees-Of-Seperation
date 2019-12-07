import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays;

public class Main{

	public static void main(String[] args){


		
		FileRead FR = new FileRead("tmdb_5000_credits.csv");
		Graph graph = FR.read();

		String ret = graph.findPath("Will Smith", "Jackie Chan");
		System.out.println(ret);
	


	}
}
