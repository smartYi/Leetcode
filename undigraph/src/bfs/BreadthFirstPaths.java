package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import dfs.Graph;

public class BreadthFirstPaths {
	private boolean[] marked;
	private int[] edgeTo;
	private final int s; //The starting vertex
	
	public BreadthFirstPaths(Graph g, int s) {
		marked = new boolean[g.getVertex()];
		edgeTo = new int[g.getVertex()];
		this.s = s;
		bfs(g,s);
	}
	
	/**
	 * bfs fucntion
	 * @param g
	 * @param v
	 */
	private void bfs(Graph g, int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		marked[v] = true;
		queue.offer(v);
		
		while(!queue.isEmpty()) {
			int s = queue.poll();
			for(int w:g.getAdj(s)) {
				if(!marked[w]) {
					marked[w] = true;
					edgeTo[w] = v;
					queue.offer(w);
				}
			}
		}
	}
	
	/**
	 * Check if there is a path between s and v.
	 * @param v
	 * @return
	 */
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	/**
	 * This function returns the path between s and v.
	 * @param v
	 * @return
	 */
	public ArrayList<Integer> pathTo(int v) {
		ArrayList<Integer> path = new ArrayList<Integer>();
		
		if(!hasPathTo(v)) return null;
		
		for(int x = v; x != s; x = edgeTo[x]) {
			path.add(x);
		}
		path.add(s);
		return path;
	}
	
}
