##RUN TIME ANALYSIS 

#Reading File
-Reads CSV_File @ O(N^2) into graph where N == sizeOf(CSV_File)
#Finds nearest neighbor path @:
-O(|V| + |E|) where V == (number of verticies) and E == (number of edges) in the worst case since it theoretically might  have to travel through the entire graph to find a neighboring actor