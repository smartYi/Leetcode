package cc;

import dfs.Graph;

/**
 * This class file is to check how many connection part in one graph 
 * and thus can easily check whether two vertex is connected or not.
 * @author qiuyi
 *
 */
public class CC {
	private boolean[] marked;
	private int count = 0; //This variable is to store the number of CC in this graph
	private int[] id; //This array is to store which CC part each vertex belongs to.
	
	public CC(Graph G) {
		marked = new boolean[G.getVertex()];
		id = new int[G.getVertex()];
		
		for(int s = 0 ; s < G.getVertex(); s++) {
			if(!marked[s]) {
				dfs(G,s);
				count++;
			}
		}
	}
	
	/**
	 * Use dfs to construct a tree.
	 * @param G
	 * @param s
	 */
	public void dfs(Graph G, int s) {
		marked[s] = true;
		id[s] = count;
		for(int w:G.getAdj(s)) {
			if(!marked[w]) dfs(G, w);
		}
	}
	
	/**
	 * Check two vertex whether connected or not.
	 * Just check which CC part they belong to.
	 * @param v
	 * @param w
	 * @return
	 */
	public boolean connected(int v, int w) {
		return id[v] == id[w];
	}
	
	/**
	 * Return the CC part a vertex belong to.
	 * @param v
	 * @return
	 */
	public int getId(int v) {
		return id[v];
	}
	
	/**
	 * This function return the number of CC part in the graph
	 * @return
	 */
	public int getCount() {
		return count;
	}
}
