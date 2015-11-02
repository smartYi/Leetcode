package symbolgraph;

import java.util.HashMap;

import dfs.Graph;

/**
 * This class file is to build a graph using string as index rather integer.
 * We need iterate the graph twice to completely build the graph.
 * Here we use hash map.
 * @author qiuyi
 *
 */
public class SymbolGraph {
	private HashMap<String, Integer> map;
	private String[] keys;
	private Graph G;
	
	public SymbolGraph(String input, String sp) {
		//Build a map from String to Integer
		map = new HashMap<String,Integer>();
		In in = new In(input);
		while(in.hasNextLine()) {
			String[] a = in.readLine().split(sp);
			for(int i=0;i<a.length;i++) {
				if (!map.containsKey(a[i])) {
					map.put(a[i], map.size());
				}
			}
		}
		
		//Build a reverse_map from index to String.
		//The reverse method of map.
		keys = new String[map.size()];
		for (String name:map.keySet()) {
			keys[map.get(name)] = name;
		}
		
		G = new Graph(map.size());
		In in = new In(input);
		while(in.hasNextLine()) {
			String[] a = in.readLine().split(sp);
			int v = map.get(a[0]);
			for(int i=1;i<a.length;i++) {
				G.addEdge(v, map.get(a[i]));
			}
		}
		
	}
	
	public boolean contains(String s) {return map.containsKey(s);}
	public int index(String name) {return map.get(name);}
	public String name(int i) {return keys[i];}
	public Graph getG() {return G;}
}
