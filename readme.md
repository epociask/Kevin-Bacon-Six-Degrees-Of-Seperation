## RUN TIME ANALYSIS 

# Reading File
  - Reads CSV_File @ O(N^2) into graph where N == sizeOf(CSV_File) since iteration is done by row, then by content in row 
  - Adds edges @ constant time of O(1) 

# Finds nearest neighbor path @:
  - O(|V| + |E|) where V == (number of verticies) and E == (number of edges) in the worst case since it theoretically might have to travel through the entire graph || all connected verticies to find a neighboring actor

## Project Functionality 

# Graph.java
  - Graph representation as HashMap of String--> ArrayList<String>
  - Has recursive BFS that traverses graph to find shortest path between two actors 
  
# CS245A2.java
  - Main driver class 
  - Takes in fileName as a CMD argument
  - Runs main.java to start global project 
  
# Main.java
  - Connector class; links graph class w/ file reader class
  - Handles user input for driver class w/ a validation loop cyclde
 
