import java.util.Scanner;

public class Main{


	public FileRead FR;
	public Graph GRAPH;
	public Scanner inDevice;

	//Main class to merge FileRead w/ Graph
	public Main(String fileName){

		this.FR = new FileRead(fileName);
		//Reads data file to our graph	
		this.GRAPH = FR.read();
		//User Input Device 
		this.inDevice = new Scanner(System.in);

	}

	//UI method for string 
	public String getString(){

	String ret = ""; 
	try{
		ret = this.inDevice.nextLine();

	}catch(Exception e){

		System.out.println("INVALID INPUT EXCEPTION \n Please Try Typing Input Again");
		getString();
	}

	return ret; 
	}

	//returns shortest path from graph 
	public String getShortestPathBetweenTwo(String actor1, String actor2){

		return this.GRAPH.findPath(actor1, actor2);
	}


	//Starts main program
	public void start(){


		boolean go = true;

		System.out.println("WELCOME TO THE SHOREST PATH BETWEEN TWO ACTORS BY MOVIES \n ------------ \n ------------");


		while(go){

			System.out.println("Input Actor #1");

			String act1 = getString();

			System.out.println("Input Actor #2");

			String act2 = getString();

			String path = getShortestPathBetweenTwo(act1, act2);


			if(path.equals("")){
				System.out.println("Bad Input.... Could Not Find Actor");
			}else{
				System.out.println("\n ------------ \n ------------\n" + path);
			}


			System.out.println("Would you like to continue \n(1)yes \n(2)no\n");

			String decision = getString();

			if(decision.equals("no") || decision.equals("2") || decision.equals("nO") || decision.equals("n") || decision.equals("N") || decision.equals("No") || decision.equals("NO"))
				go = false;

		}
	}
}
