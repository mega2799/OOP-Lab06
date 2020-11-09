package it.unibo.oop.lab06.generics1;

import java.util.*;

public class GraphImpl<N> implements Graph<N> {
	
	final List<N> vicini = new ArrayList<>();
	final private Map<N,Set<N>> edges = new HashMap<>();
	
	@Override
	public void addNode(N node) {
		this.edges.put(node,new TreeSet<>());
	}

	@Override
	public void addEdge(N source, N target) {
		if(this.edges.containsKey(source)) {
			this.edges.get(source).add(target);
			this.edges.get(target).add(source);
		}
	}

	@Override
	public Set<N> nodeSet() {
		return this.edges.keySet();
	}

	@Override
	public Set<N> linkedNodes(N node) {
		return this.edges.get(node);
	}

	@Override
	public List<N> getPath(N source, N target) {
		// recursive ? 
		if(source.equals(target)) {
			System.out.println(target);
		}else {
			System.out.println("TODO");
		}
		return null;
	}

}
