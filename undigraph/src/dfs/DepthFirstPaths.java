package dfs;

import java.util.ArrayList;

/**
 * This class file is to find whether two vertex are connected in a graph
 * @author qiuyi
 *
 */
public class DepthFirstPaths {
	private boolean[] marked;
	private final int s; //Starting point
	private int[] edgeTo;
	
	public DepthFirstPaths(Graph g, int s) {
		marked = new boolean[g.getVertex()];
		edgeTo = new int[g.getVertex()];
		this.s = s;
		dfs(g,s);
	}
	
	/**
	 * dfs find path function
	 * @param g
	 * @param v
	 */
	private void dfs(Graph g, int v) {
		marked[v] = true;
		for(int w:g.getAdj(v)) {
			if(!marked[w]) {
				edgeTo[w] = v;
				dfs(g, w);
			}
		}
	}
	
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	
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
