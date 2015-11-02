package cycle;

import dfs.Graph;

/**
 * This class file is to check the graph a cycle or not.
 * @author qiuyi
 *
 */
public class Cycle {
	private boolean[] marked;
	private boolean hasCycle;
	
	public Cycle(Graph G) {
		marked = new boolean[G.getVertex()];
		
		for (int s = 0; s < G.getVertex(); s++) {
			if(!marked[s]) {
				dfs(G,s,s);
			}
		}
	}
	
	/**
	 * This function is to check whether this graph has a cycle or not
	 * @param G
	 * @param v
	 * @param u //Here u is the source vertex of v
	 */
	public void dfs(Graph G, int  v, int u) {
		marked[v] = true;
		
		for(int w:G.getAdj(v)) {
			if(!marked[w]) {
				dfs(G, w, v);
			}
			//Check if this is not a parallel edge, then this is a cycle.
			else if (w != u) hasCycle = true;
		}
	}
	
	public boolean hasCycle() {
		return hasCycle;
	}
}
