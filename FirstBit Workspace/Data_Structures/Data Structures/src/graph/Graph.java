package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	
	Map<String, List<String>> adjList;
	
	Graph(){
		adjList = new HashMap<>();
	}
	
	void addEdge(String v1,String v2) {
		adjList.putIfAbsent(v1, new ArrayList<>());
		adjList.putIfAbsent(v2, new ArrayList<>());
		
		adjList.get(v1).add(v2);
		adjList.get(v2).add(v1);
	}
	
	void display() {
		for(String k: adjList.keySet()) {
			System.out.println(k + " : " + "[ "+adjList.get(k)+" ]");
		}
	}

}
