package class5HeapAndGraph;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author guoyifeng
 * Determine if an undirected graph is bipartite. 
 * A bipartite graph is one in which the nodes can be divided into 
 * two groups such that no nodes have direct edges to other nodes in the same group.

	Examples
	
	1  --   2
	
	    /   
	
	3  --   4
	
	is bipartite (1, 3 in group 1 and 2, 4 in group 2).
	
	1  --   2
	
	    /   |
	
	3  --   4
	
	is not bipartite.
	
	Assumptions
	
	The graph is represented by a list of nodes, and the list of nodes is not null.
 */

class GraphNode {
	public int key;
	public List<GraphNode> neighbors;

	public GraphNode(int key) {
		this.key = key;
		this.neighbors = new ArrayList<GraphNode>();
	}
}

public class Bipartite {
	public boolean isBipartite(List<GraphNode> graph) {
		if(graph == null) {
			return true;
		}
		
		List<GraphNode> g1 = new ArrayList<>();
		List<GraphNode> g2 = new ArrayList<>();
		
		return false;
	}
}
