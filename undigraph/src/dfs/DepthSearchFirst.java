package dfs;

/**
 * This is a basic implementation of dfs
 * @author qiuyi
 *
 */
public class DepthSearchFirst {
	private boolean[] marked;
	private int count;
	
	public DepthSearchFirst(Graph g, int s) {
		marked = new boolean[g.getVertex()];
		dfs(g,s);  //This way can't reach to every vertex if the graph is not a connected graph
		for(int v = 0; v < g.getVertex(); v++) {
			if(!marked(v)) {
				dfs(g, v);
			}
		}//This way can always reach to every vertex whether the graph is connected or not
	}
	
	/**
	 * dfs fucntion
	 * @param g
	 * @param v
	 */
	private void dfs(Graph g, int v) {
		marked[v] = true;
		count++;
		for(int w:g.getAdj(v)) {
			if(!marked[w]) dfs(g, w);
		}
	}
	
	public boolean marked(int w) {
		return marked[w];
	}
	
	public int getCount() {
		return count;
	}
}
