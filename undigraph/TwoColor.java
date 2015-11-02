package twocolor;

import dfs.Graph;

/**
 * This class file is to check whether a graph can be divide into two colors
 * @author qiuyi
 *
 */
public class TwoColor {
	private boolean[] marked;
	private boolean[] color;
	private boolean isTwoColor = true;
	
	public TwoColor(Graph G) {
		marked = new boolean[G.getVertex()];
		color = new boolean[G.getVertex()];
		
		for(int s = 0; s<G.getVertex(); s++) {
			if(!marked[s]) {
				dfs(G,s);
			}
		}
	}
	
	public void dfs(Graph G, int s) {
		marked[s] = true;
		
		for (int w:G.getAdj(s)) {
			if(!marked[w]) {
				color[w] = !color[s]; //Always set vertex adjacent vertex color opposite to 
				//its original color
				dfs(G, w);
			}
			else if(color[w] == color[s]) isTwoColor = false;
		}
	}
	
	public boolean isTwoColor() {
		return isTwoColor;
	}
}
