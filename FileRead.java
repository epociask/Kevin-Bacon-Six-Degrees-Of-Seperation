import java.io.FileReader;
import java.io.BufferedReader;
import java.lang.Exception;
import java.util.Arrays;
import java.util.ArrayList;


//File reading class 
public class FileRead{

	private BufferedReader br;
		public Graph graph; 


	//takes in file as parameter in constructor 
	public FileRead(String fileName){
		 graph = new Graph();

	try{
		this.br = new BufferedReader(new FileReader(fileName));
		
	}catch(Exception e){
		//Incorrect file name || location passed 
		System.out.println("FILE NOT FOUND EXCEPTION");
		System.exit(0);
	}
		this.read();

	}		

	//Reads data from file and returns as graph
	public Graph read(){


	try{
		String line = "";
		while((line = br.readLine()) != null){

		 String[] tokens = line.split(",");
		 boolean found = true;
		 ArrayList<String> actors = new ArrayList<String>();

                for(String token : tokens){
                if(found){

                	//We've reached the end of actors for a given movie 
                	if(token.contains("department"))
                		found = false; //Stops parsing names 

                	//Checks if we've found an actor 
                    if(token.contains("name"))//If so, parse accordingly by white space and } length.. then trim white space and convert to lower case 
                    	actors.add(token.substring(13, token.charAt(token.length()-1) == '}' ? token.length()-3 : token.length()-2).trim().toLowerCase());
                	
            		}

                    	}


                for(int i = 0; i < actors.size()-1; i++)//Adds edges to our graph 
                    for(int x = i+1; x < actors.size(); x++)
                    	graph.addEdge(actors.get(i), actors.get(x));
                    	

                    
                    	
        }
       System.out.println("SUCCESSFULL PARSING OF ACTOR DATA\n");
	}catch(Exception e){//Mskes sure program doesn't crash if we read a line improperly 

	}
	finally{

	try{
		this.br.close();//Exception handling for closing buffered reader 

	}catch(Exception e){

	}
	}


	return graph;//returns updated graph with actor data 
}

}