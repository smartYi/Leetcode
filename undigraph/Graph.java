package dfs;

import java.util.ArrayList;

/**
 * This is the basic implementation for graph
 * @author qiuyi
 *
 */
public class Graph {
	//The number of vertex
	private final int V;
	
	//The number of edges
	private int E;
	
	//For each vertex, there is a array list
	private ArrayList<Integer>[] adj;
	
	/**
	 * Construction function with the number of vertex
	 * @param V
	 */
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		for(int i=0; i<V;i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}
	
	/**
	 * Return the number of vertex
	 * @return
	 */
	public int getVertex() {
		return V;
	}
	
	/**
	 * Return the number of edge
	 * @return
	 */
	public int getEdge() {
		return E;
	}
	
	/**
	 * Add a edge between vertex v and w
	 * @param v
	 * @param w
	 */
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	/**
	 * Get the vertex adjacent vertex
	 * @param v
	 * @return
	 */
	public ArrayList<Integer> getAdj(int v) {
		return adj[v];
	}
	
	/**
	 * Override toString function to print the Graph
	 */
	@Override
	public String toString() {
		String s = V + " vertices, and " + E + " edges\n";
		
		for(int i=0;i<V;i++) {
			s += i + ":";
			for(int w:adj[i]) {
				s += w + " , ";
			}
			s += "\n";
		}
		return s;
	}
}
