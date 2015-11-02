package bfs;

import java.util.LinkedList;
import java.util.Queue;

import dfs.Graph;

public class BreadthFirstSearch {
	private boolean[] marked;
	
	public BreadthFirstSearch(Graph g, int s) {
		marked = new boolean[g.getVertex()];
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
					queue.offer(w);
				}
			}
		}
	}
}
