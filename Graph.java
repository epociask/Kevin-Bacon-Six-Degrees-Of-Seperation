import java.util.*;

public class Graph{
// For simplicity, lets represent the graph as a HashMap w/ (key, val) as (String, AL(String)) so we can reference the actors costars as a key like the actor himself 

/*

EX
(key) -->(val)
(Actor1) -->(Actor2)
(Actor2) -->(Actor1)

*/ 

 public Map<String, LinkedList<String>> adjList; 


public Graph(){

    this.adjList = new HashMap();
}

//adds an edge between two actors by assigning each as key,value pair of each other 
public void addEdge(String actor1, String actor2){

    if(actor1.equals(actor2))
        return; 
    

    if(this.adjList.get(actor1) == null)//Key not in graph yet, let's make it 
        this.adjList.put(actor1, new LinkedList<String>());
    
    if(this.adjList.get(actor2) == null)
        this.adjList.put(actor2, new LinkedList<String>());

    this.adjList.get(actor1).add(actor2);
    this.adjList.get(actor2).add(actor1);



}

public String findPath(String actor1, String  actor2){

        return findPath(actor1.toLowerCase(), actor2.toLowerCase(), "");
}

//Recursive BFS
//Checks an actor's costar costars first to see if the other actor is present // If not, we check the next costar in actors list  
private String findPath(String actor1, String actor2, String path){

    path += actor1 + "--->";
    LinkedList<String> tempList = adjList.get(actor1);

    if(tempList.contains(actor2))
        return (path + actor2).toUpperCase();
    
  
    for(String actor : tempList)
        if(adjList.get(actor).contains(actor2))
            return findPath(actor, actor2, path);

     for(String actor : tempList)
        if(!path.contains(actor))
            return findPath(actor, actor2, path); 



    return ""; //Never found 

}

}